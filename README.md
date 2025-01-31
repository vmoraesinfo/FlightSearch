Sure! Below is a sample README file for a Flight Search API.

---

# Flight Search API

## Overview

The Flight Search API allows you to search for lowest flights based on various parameters such as departure and arrival cities, year and month. This API provides real-time data on available flights, airlines, prices, and other related information.

## Features

- **Flight Search By Year**: Search flights from an origin to a destination based on the year listing by month the lowest fares.
- **Flight Search By Year Lowest**: Search flights from an origin to a destination based on the year showing the lowest fare in the year.
- **Flight Search By Month**: Search flights from an origin to a destination based on the year and month listing in the month the lowest afres in the day.
- **Flight Search By Month Lowest**: Search flights from an origin to a destination based on the year and month listing the lowest fare in the month.



## Endpoints

### 1. Flight Search By Year

**Endpoint**: `/flights/search/year/{year}?origin={origin}&destination={destination}`

**Method**: `GET`

**Description**: Search for Lowest fares flights based on provided parameters.

**Parameters**:
- `origin`: (required) Departure airport code (e.g., `JFK`).
- `destination`: (required) Arrival airport code (e.g., `LAX`).
- `Year`: (required) Month of departure (format: `YYYY`).

**Example Request**:
```bash
GET /v1/flights/search/year/2025?origin=LIS&destination=POA
```

**Example Response**:
```json
{
  "1": [
    {
      "arrivalAirport": "POA",
      "bestTotalPrice": 6096.68,
      "bestTotalMiles": 0,
      "cabinClass": "E",
      "currency": "BRL",
      "departureAirport": "LIS",
      "departureDate": "2025-01-31T00:00:00",
      "insertionDate": "2025-01-30T01:05:48",
      "market": "BR",
      "tripType": "R",
      "monthlyMinimum": true,
      "monthlyMaximum": false,
      "starAlliance": false,
      "soldOut": false,
      "noFlights": false
    }
  ],
  "2": [
    {
      "arrivalAirport": "POA",
      "bestTotalPrice": 4329.55,
      "bestTotalMiles": 0,
      "cabinClass": "E",
      "currency": "BRL",
      "departureAirport": "LIS",
      "departureDate": "2025-02-11T00:00:00",
      "insertionDate": "2025-01-25T12:00:45",
      "market": "BR",
      "tripType": "R",
      "monthlyMinimum": true,
      "monthlyMaximum": false,
      "starAlliance": false,
      "soldOut": false,
      "noFlights": false
    }
  ],
  "3": [
    {
      "arrivalAirport": "POA",
      "bestTotalPrice": 3831.24,
      "bestTotalMiles": 0,
      "cabinClass": "E",
      "currency": "BRL",
      "departureAirport": "LIS",
      "departureDate": "2025-03-25T00:00:00",
      "insertionDate": "2025-01-30T19:43:48",
      "market": "BR",
      "tripType": "R",
      "monthlyMinimum": true,
      "monthlyMaximum": false,
      "starAlliance": false,
      "soldOut": false,
      "noFlights": false
    }
  ],
  "4": [
    {
      "arrivalAirport": "POA",
      "bestTotalPrice": 2926.48,
      "bestTotalMiles": 0,
      "cabinClass": "E",
      "currency": "BRL",
      "departureAirport": "LIS",
      "departureDate": "2025-04-08T00:00:00",
      "insertionDate": "2025-01-30T19:33:43",
      "market": "BR",
      "tripType": "R",
      "monthlyMinimum": true,
      "monthlyMaximum": false,
      "starAlliance": false,
      "soldOut": false,
      "noFlights": false
    }
  ],
  "5": [
    {
      "arrivalAirport": "POA",
      "bestTotalPrice": 3017.03,
      "bestTotalMiles": 0,
      "cabinClass": "E",
      "currency": "BRL",
      "departureAirport": "LIS",
      "departureDate": "2025-05-08T00:00:00",
      "insertionDate": "2025-01-30T01:22:37",
      "market": "BR",
      "tripType": "R",
      "monthlyMinimum": true,
      "monthlyMaximum": false,
      "starAlliance": false,
      "soldOut": false,
      "noFlights": false
    }
  ],
  "6": [
    {
      "arrivalAirport": "POA",
      "bestTotalPrice": 3172.42,
      "bestTotalMiles": 0,
      "cabinClass": "E",
      "currency": "BRL",
      "departureAirport": "LIS",
      "departureDate": "2025-06-14T00:00:00",
      "insertionDate": "2025-01-30T13:34:19",
      "market": "BR",
      "tripType": "R",
      "monthlyMinimum": true,
      "monthlyMaximum": false,
      "starAlliance": false,
      "soldOut": false,
      "noFlights": false
    }
  ],
  "7": [
    {
      "arrivalAirport": "POA",
      "bestTotalPrice": 4056.68,
      "bestTotalMiles": 0,
      "cabinClass": "E",
      "currency": "BRL",
      "departureAirport": "LIS",
      "departureDate": "2025-07-05T00:00:00",
      "insertionDate": "2025-01-27T14:55:31",
      "market": "BR",
      "tripType": "R",
      "monthlyMinimum": true,
      "monthlyMaximum": false,
      "starAlliance": false,
      "soldOut": false,
      "noFlights": false
    }
  ],
  "8": [
    {
      "arrivalAirport": "POA",
      "bestTotalPrice": 2958.22,
      "bestTotalMiles": 0,
      "cabinClass": "E",
      "currency": "BRL",
      "departureAirport": "LIS",
      "departureDate": "2025-08-16T00:00:00",
      "insertionDate": "2025-01-29T23:47:59",
      "market": "BR",
      "tripType": "R",
      "monthlyMinimum": true,
      "monthlyMaximum": false,
      "starAlliance": false,
      "soldOut": false,
      "noFlights": false
    }
  ],
  "9": [
    {
      "arrivalAirport": "POA",
      "bestTotalPrice": 2959.97,
      "bestTotalMiles": 0,
      "cabinClass": "E",
      "currency": "BRL",
      "departureAirport": "LIS",
      "departureDate": "2025-09-09T00:00:00",
      "insertionDate": "2025-01-24T15:28:24",
      "market": "BR",
      "tripType": "R",
      "monthlyMinimum": true,
      "monthlyMaximum": false,
      "starAlliance": false,
      "soldOut": false,
      "noFlights": false
    },
    {
      "arrivalAirport": "POA",
      "bestTotalPrice": 2959.97,
      "bestTotalMiles": 0,
      "cabinClass": "E",
      "currency": "BRL",
      "departureAirport": "LIS",
      "departureDate": "2025-09-11T00:00:00",
      "insertionDate": "2025-01-24T15:28:24",
      "market": "BR",
      "tripType": "R",
      "monthlyMinimum": true,
      "monthlyMaximum": false,
      "starAlliance": false,
      "soldOut": false,
      "noFlights": false
    },
    {
      "arrivalAirport": "POA",
      "bestTotalPrice": 2959.97,
      "bestTotalMiles": 0,
      "cabinClass": "E",
      "currency": "BRL",
      "departureAirport": "LIS",
      "departureDate": "2025-09-13T00:00:00",
      "insertionDate": "2025-01-24T15:28:24",
      "market": "BR",
      "tripType": "R",
      "monthlyMinimum": true,
      "monthlyMaximum": false,
      "starAlliance": false,
      "soldOut": false,
      "noFlights": false
    }
  ],
  "10": [
    {
      "arrivalAirport": "POA",
      "bestTotalPrice": 3191.98,
      "bestTotalMiles": 0,
      "cabinClass": "E",
      "currency": "BRL",
      "departureAirport": "LIS",
      "departureDate": "2025-10-02T00:00:00",
      "insertionDate": "2025-01-28T12:54:47",
      "market": "BR",
      "tripType": "R",
      "monthlyMinimum": true,
      "monthlyMaximum": false,
      "starAlliance": false,
      "soldOut": false,
      "noFlights": false
    }
  ],
  "11": [
    {
      "arrivalAirport": "POA",
      "bestTotalPrice": 2926.48,
      "bestTotalMiles": 0,
      "cabinClass": "E",
      "currency": "BRL",
      "departureAirport": "LIS",
      "departureDate": "2025-11-25T00:00:00",
      "insertionDate": "2025-01-30T09:26:56",
      "market": "BR",
      "tripType": "R",
      "monthlyMinimum": true,
      "monthlyMaximum": false,
      "starAlliance": false,
      "soldOut": false,
      "noFlights": false
    }
  ],
  "12": [
    {
      "arrivalAirport": "POA",
      "bestTotalPrice": 2943.52,
      "bestTotalMiles": 0,
      "cabinClass": "E",
      "currency": "BRL",
      "departureAirport": "LIS",
      "departureDate": "2025-12-02T00:00:00",
      "insertionDate": "2025-01-27T03:29:39",
      "market": "BR",
      "tripType": "R",
      "monthlyMinimum": true,
      "monthlyMaximum": false,
      "starAlliance": false,
      "soldOut": false,
      "noFlights": false
    }
  ]
}
```

### 2. Flight Search By Year Lowest

**Endpoint**: `/flights/search/year/{year}/lowest?origin={origin}&destination={destination}`

**Method**: `GET`

**Description**: Search for Lowest fares flights based on provided parameters.

**Parameters**:
- `origin`: (required) Departure airport code (e.g., `JFK`).
- `destination`: (required) Arrival airport code (e.g., `LAX`).
- `Year`: (required) Month of departure (format: `YYYY`).

**Example Request**:
```bash
GET /v1/flights/search/year/2025/lowest?origin=LIS&destination=POA
```

**Example Response**:
```json
[
  {
    "arrivalAirport": "POA",
    "bestTotalPrice": 2926.48,
    "bestTotalMiles": 0,
    "cabinClass": "E",
    "currency": "BRL",
    "departureAirport": "LIS",
    "departureDate": "2025-04-08T00:00:00",
    "insertionDate": "2025-01-30T19:33:43",
    "market": "BR",
    "tripType": "R",
    "monthlyMinimum": true,
    "monthlyMaximum": false,
    "starAlliance": false,
    "soldOut": false,
    "noFlights": false
  },
  {
    "arrivalAirport": "POA",
    "bestTotalPrice": 2926.48,
    "bestTotalMiles": 0,
    "cabinClass": "E",
    "currency": "BRL",
    "departureAirport": "LIS",
    "departureDate": "2025-11-25T00:00:00",
    "insertionDate": "2025-01-30T09:26:56",
    "market": "BR",
    "tripType": "R",
    "monthlyMinimum": true,
    "monthlyMaximum": false,
    "starAlliance": false,
    "soldOut": false,
    "noFlights": false
  }
]
```

### 3. Flight Search By Month

**Endpoint**: `/flights/search/year/{year}/month/{month}?origin={origin}&destination={destination}`

**Method**: `GET`

**Description**: Search for Lowest fares flights based on provided parameters.

**Parameters**:
- `origin`: (required) Departure airport code (e.g., `JFK`).
- `destination`: (required) Arrival airport code (e.g., `LAX`).
- `Month`:  (required) Month of departure (format: `MM`).
- `Year`: (required) Month of departure (format: `YYYY`).

**Example Request**:
```bash
GET /v1/flights/search/year/2025/month/05?origin=LIS&destination=POA
```

**Example Response**:
```json
[
  {
    "arrivalAirport": "POA",
    "bestTotalPrice": 6352.65,
    "bestTotalMiles": 0,
    "cabinClass": "E",
    "currency": "BRL",
    "departureAirport": "LIS",
    "departureDate": "2025-01-30T00:00:00",
    "insertionDate": "2025-01-30T01:05:48",
    "market": "BR",
    "tripType": "R",
    "monthlyMinimum": false,
    "monthlyMaximum": true,
    "starAlliance": false,
    "soldOut": false,
    "noFlights": false
  },
  {
    "arrivalAirport": "POA",
    "bestTotalPrice": 6096.68,
    "bestTotalMiles": 0,
    "cabinClass": "E",
    "currency": "BRL",
    "departureAirport": "LIS",
    "departureDate": "2025-01-31T00:00:00",
    "insertionDate": "2025-01-30T01:05:48",
    "market": "BR",
    "tripType": "R",
    "monthlyMinimum": false,
    "monthlyMaximum": false,
    "starAlliance": false,
    "soldOut": false,
    "noFlights": false
  },
  {
    "arrivalAirport": "POA",
    "bestTotalPrice": 6793.91,
    "bestTotalMiles": 0,
    "cabinClass": "E",
    "currency": "BRL",
    "departureAirport": "LIS",
    "departureDate": "2025-02-01T00:00:00",
    "insertionDate": "2025-01-30T01:05:48",
    "market": "BR",
    "tripType": "R",
    "monthlyMinimum": false,
    "monthlyMaximum": true,
    "starAlliance": false,
    "soldOut": false,
    "noFlights": false
  },
  {
    "arrivalAirport": "POA",
    "bestTotalPrice": 6283.13,
    "bestTotalMiles": 0,
    "cabinClass": "E",
    "currency": "BRL",
    "departureAirport": "LIS",
    "departureDate": "2025-02-02T00:00:00",
    "insertionDate": "2025-01-30T01:05:48",
    "market": "BR",
    "tripType": "R",
    "monthlyMinimum": false,
    "monthlyMaximum": false,
    "starAlliance": false,
    "soldOut": false,
    "noFlights": false
  },
  {
    "arrivalAirport": "POA",
    "bestTotalPrice": 5306.11,
    "bestTotalMiles": 0,
    "cabinClass": "E",
    "currency": "BRL",
    "departureAirport": "LIS",
    "departureDate": "2025-02-03T00:00:00",
    "insertionDate": "2025-01-30T14:45:30",
    "market": "BR",
    "tripType": "R",
    "monthlyMinimum": false,
    "monthlyMaximum": false,
    "starAlliance": false,
    "soldOut": false,
    "noFlights": false
  },
  {
    "arrivalAirport": "POA",
    "bestTotalPrice": 5675.75,
    "bestTotalMiles": 0,
    "cabinClass": "E",
    "currency": "BRL",
    "departureAirport": "LIS",
    "departureDate": "2025-02-04T00:00:00",
    "insertionDate": "2025-01-30T14:45:30",
    "market": "BR",
    "tripType": "R",
    "monthlyMinimum": false,
    "monthlyMaximum": false,
    "starAlliance": false,
    "soldOut": false,
    "noFlights": false
  },
  {
    "arrivalAirport": "POA",
    "bestTotalPrice": 6228.37,
    "bestTotalMiles": 0,
    "cabinClass": "E",
    "currency": "BRL",
    "departureAirport": "LIS",
    "departureDate": "2025-02-05T00:00:00",
    "insertionDate": "2025-01-30T14:45:31",
    "market": "BR",
    "tripType": "R",
    "monthlyMinimum": false,
    "monthlyMaximum": false,
    "starAlliance": false,
    "soldOut": false,
    "noFlights": false
  },
...
]
```

### 4. Flight Search By Month Lowest

**Endpoint**: `/flights/search/year/{year}/month/{month}/lowest?origin={origin}&destination={destination}`

**Method**: `GET`

**Description**: Search for Lowest fares flights based on provided parameters.

**Parameters**:
- `origin`: (required) Departure airport code (e.g., `JFK`).
- `destination`: (required) Arrival airport code (e.g., `LAX`).
- `Month`:  (optional) Month of departure (format: `MM`).
- `Year`: (required) Month of departure (format: `YYYY`).

**Example Request**:
```bash
GET /v1/flights/search/year/2025/month/05/lowest?origin=LIS&destination=POA
```

**Example Response**:
```json
[
  {
    "arrivalAirport": "POA",
    "bestTotalPrice": 3017.03,
    "bestTotalMiles": 0,
    "cabinClass": "E",
    "currency": "BRL",
    "departureAirport": "LIS",
    "departureDate": "2025-05-08T00:00:00",
    "insertionDate": "2025-01-30T01:22:37",
    "market": "BR",
    "tripType": "R",
    "monthlyMinimum": true,
    "monthlyMaximum": false,
    "starAlliance": false,
    "soldOut": false,
    "noFlights": false
  }
]
```
