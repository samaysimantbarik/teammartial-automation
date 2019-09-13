
<html>
<h2>Project Description:<h2> This is a sample test automation project for TeamMartial Website

<h4>Tech Stack used:</h4>
<ul> 
 <li>Java: Version 12 </li>
 <li>Maven : Build Tool </li>
 <li>Selenium : Web Automation API</li>
 <li>Cucumber : BDD Framework</li>
 <li>Spring : For Dependency Injection and Context Management</li>
 <li>Faker : For test data generation</li>
 </ul>
	 
<h4>Set Up<h4>
 <div>
	 <h6> For executing in any IDE:<h6>
	 <p>
	 Clone the project .
	 <span>Create a .env file in the project root.</span>
	 <span>Enter the below data:</span>
		 <ul>
			<li>BROWSER=CHROME</li>
			<li>TM_URL=http://teammartial.com/#/login</li>
			<li>TIMEOUT=10</li>
			<li>PAGELOAD_TIMEOUT=60</li>
			<li>TM_USERNAME={your_user_name}</li>
			<li>TM_PASSWORD={your password}</li>
		 </ul>
	 </div>
	 
 <div>
 <h3> For executing in command line</h3>
 <p>
<span>Set the environment variables.</span>
  
     WINDOWS:
		set BROWSER=CHROME
		set TM_URL=http://teammartial.com/#/login
		set TIMEOUT=10
		set PAGELOAD_TIMEOUT=60
		set TM_USERNAME={your_user_name}
		set TM_PASSWORD={your password}
	
	 MAC/LINUX:
	
		export BROWSER=CHROME
		export TM_URL=http://teammartial.com/#/login
		export TIMEOUT=10
		export PAGELOAD_TIMEOUT=60
		export TM_USERNAME={your_user_name}
		export TM_PASSWORD={your password}
 </p>
 
 </div>
 </html>