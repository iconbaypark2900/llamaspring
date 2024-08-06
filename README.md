# Weather Application

This project is a Spring Boot application designed to interact with the WeatherAPI and the Ollama API. It provides functionality to fetch current weather data for a specified city and to interact with the Llama 3.1 model for weather-related queries.

## Components

### 1. CityController
- **Package:** `llamaspring.llamathree.functions`
- **Description:** This controller handles HTTP GET requests for city-related information. It uses a `ChatClient` to interact with an AI assistant that answers questions about cities around the world.
- **Endpoint:** `/cities`

### 2. FunctionConfiguration
- **Package:** `llamaspring.llamathree.functions`
- **Description:** This configuration class defines a bean for fetching current weather conditions for a given city. It leverages the `WeatherService` to perform the API calls.

### 3. WeatherConfigProperties
- **Package:** `llamaspring.llamathree.functions`
- **Description:** This class holds the configuration properties for the WeatherAPI, including the API key and URL.

### 4. WeatherService
- **Package:** `llamaspring.llamathree.functions`
- **Description:** This service class is responsible for interacting with the WeatherAPI. It uses the provided API key and URL to fetch current weather data for a specified city and logs the responses.
- **Functionality:** 
  - Fetch current weather data for a given city.
  - Log the request and response details.

## Technologies Used
- Spring Boot
- WeatherAPI
- Ollama API
- RESTful Web Services
- llama 3.1

## License
This project is licensed under the MIT License.
