import axios from 'axios'

const axiosClient = axios.create({
    baseURL: `https://5fbfb63cfd14be0016748f86.mockapi.io`,
    timeout: 5000
})


export default axiosClient
