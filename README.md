<h1>Java Currency Converter Challenge</h1>

<p>Implement a currency conversion application by querying real-time exchange rates.</p>

<h2>Description</h2>

<p>

This project is an interactive currency converter that utilizes the ExchangeRate API to obtain up-to-date quotes. The application allows conversions between the Brazilian Real (BRL) and currencies such as the Chinese Yuan (CNY), South Korean Won (KRW), and Cuban Peso (CUP), as well as their reverse operations. The program runs via terminal, offering a dynamic menu and exception handling to ensure stability during use.

</p>

<h2>Guidelines</h2>

<ul>

  <li>The menu must display at least 6 different currency conversion options;</li>

  <li>Use the ExchangeRate API to ensure accurate and real-time data;</li>

  <li>Use the Gson library for deserialization of the JSON data received from the API;</li>

  <li>Implement a console-based interface for user interaction using the Scanner class;</li>

  <li>Display the converted values based on the amount entered by the user and the current exchange rate;</li>

</ul>

<h2>Concepts Covered</h2>

<ul>
  
  <li>REST API Consumption with HTTP GET requests;</li>
  
  <li>JSON Manipulation through the Gson library to turn raw data into Java Objects (Records/DTOs);</li>
  
  <li>Using property files (.properties) to protect sensitive credentials;</li>
  
  <li>Implementing try-catch blocks to manage network issues and invalid user inputs;</li>
  
  <li>Using the <code>Scanner</code> class for user interaction.</li>

</ul>

<h2>How to Run</h2>

<ol>

  <li>Clone the repository;</li>
  
  <li>Set up dependencies (Gson library);</li>
  
  <li>Create a <code>config.properties</code> file in the root directory with your key <code>rate.apiKey=YOUR_API_KEY_HERE</code>;</li>
  
  <li>Compile and run the <code>Main</code> class;</li>

</ol> 
