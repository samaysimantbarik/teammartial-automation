
<html>
<h2>Project Description:<h2> <h5>This is a sample test automation project for TeamMartial Website</h5>

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
	
Clone the project
Environment Variables Setup:
	  
	  For executing in IDE:
			 Create a .env file in the project root.
			 Enter the below data:
		
				BROWSER=CHROME
				TM_URL=http://teammartial.com/#/login
				TIMEOUT=10
				PAGELOAD_TIMEOUT=60
				TM_USERNAME={your_user_name}
				TM_PASSWORD={your password}
		 

     For executing in command line
  
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
 
 <h6>Execution</h6>
       
       	To run test: mvn clean verify
       	Report Generation: mvn cluecumber-report:reporting
       	
 Reports will be available in the target directory -> generated-report ->index.html
 
 
 </div>
 </html>