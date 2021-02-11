import axios from 'axios'

const axiosClient = axios.create({
    baseURL: `https://5fbfb63cfd14be0016748f86.mockapi.io/api/v1`,
    timeout: 5000
})

axiosClient.interceptors.request.use(async (config) => {
    return config
})

axiosClient.interceptors.response.use((response) => {
    if (response && response.data){
        return response.data
    }
    return response
})

export default axiosClient
