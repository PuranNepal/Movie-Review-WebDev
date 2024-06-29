import axios from 'axios';

const axiosInstance = axios.create({
    baseURL: 'http://localhost:8080', // Replace with your Spring Boot API base URL
    headers: {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*', // Adjust as per your CORS configuration
    },
});

export default axiosInstance;