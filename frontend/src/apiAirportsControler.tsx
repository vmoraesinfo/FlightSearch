const API_URL = process.env.VITE_APP_BACKEND_URL;

const URL = '/api/v1/airports/search/';
const fetchAllAirports = async () => {
    try {
      // Make a GET request using the Fetch API
      const response = await fetch(`${API_URL}/${URL}`);
      
      // Check if the response is successful (status code 200-299)
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }

      // Parse the JSON data from the response
      const result = await response.json();
      return result;

    } catch (error) {
        console.error('Error fetching data:', error);
    }
};
  
  export {fetchAllAirports};