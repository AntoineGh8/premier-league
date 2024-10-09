import React, { useState, useEffect } from 'react';
import axios from 'axios';
import "./index.scss";

const DataHandling = () => {
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  const [playerData, setPlayerData] = useState([]);

  useEffect(() => {
    const params = new URLSearchParams(window.location.search);
    const teamValue = params.get('team');
    const nationValue = params.get('nation');
    const positionValue = params.get('position');

    let apiUrl = '';

    if (teamValue) {
      apiUrl = `http://localhost:8080/api/v1/player?team=${encodeURIComponent(teamValue)}`;
    } else if (nationValue) {
      apiUrl = `http://localhost:8080/api/v1/player/nation?nation=${encodeURIComponent(nationValue)}`;
    } else if (positionValue) {
      apiUrl = `http://localhost:8080/api/v1/player/position?position=${encodeURIComponent(positionValue)}`;
    }

    if (apiUrl) {
      axios.get(apiUrl)
        .then(response => {
          setPlayerData(response.data);
          setLoading(false);
        })
        .catch(error => {
          setError(error);
          setLoading(false);
        });
    } else {
      setLoading(false);
    }
  }, []);

  if (loading) {
    return <p>Loading...</p>;
  }

  if (error) {
    return <p>Error: {error.message}</p>;
  }

  return (
    <div className="table-container">
      <table>
        <thead>
          <tr>
            <th>Name</th>
            <th>Position</th>
            <th>Age</th>
            <th>Matches Played</th>
            <th>Starts</th>
            <th>Minutes Played</th>
            <th>Goals</th>
            <th>Assists</th>
            <th>Nation</th>
            <th>Team</th>
          </tr>
        </thead>
        <tbody>
          {playerData.map(player => (
            <tr key={player.name}>
              <td>{player.name}</td>
              <td>{player.pos}</td>
              <td>{player.age}</td>
              <td>{player.mp}</td>
              <td>{player.starts}</td>
              <td>{player.min}</td>
              <td>{player.gls}</td>
              <td>{player.ast}</td>
              <td>{player.nation}</td>
              <td>{player.team}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default DataHandling;
