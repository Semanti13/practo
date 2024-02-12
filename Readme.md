# Selenium Automation Testing Project: Identify New Bikes
 
## Project Overview
This Selenium automation testing project focuses on automating tasks on Practo.com
The primary objectives include capturing 5 doctor details based on various filters, extracting popular surgeries to store in a list, validating a submit button functionality.
The project uses various dependencies and libraries to facilitate automation.

## Project Structure
 
### 1. Maven Repository
 
- *Maven Version*: 3.12.1
 
### 2. Dependencies
 
- *Apache POI*
  - Version: 5.2.2
  - Purpose: Used for reading and writing Excel files, facilitating data-driven testing.
 
- *TestNG*
  - Version: 7.7.1
  - Purpose: Framework for test automation that allows for parallel execution and flexible test configuration.
 
- *Extent Report*
  - Version: 5.1.1
  - Purpose: Generates interactive and detailed HTML reports to enhance test result analysis.
 
- *Selenium*
  - Version: 4.15.0
  - Purpose: Enables interaction with web elements, navigation, and form submission in the browser.
 
- *Loggers*
  - Version: 2.22.1
  - Purpose: Provides logging capabilities for better debugging and traceability.
 
## Automation Test Flow
 
1. *Open Practo.com*
   - Navigate to the Practo.com.
 
2. *Click on Find Doctors and choose city and any one speciality*
   - Click on Find Doctors tab and choose Bangalore as city and cardiologist as speciality.
 
4. *Apply filters for Patient Stories,Experience,Fees,Availabilty and any one Sorting*
   - Select 30+ Patient Stories option.
   - Select Experience of 15+ years, Fees above Rs.500 and Availabilty in next 7 days.
   - Sorting in the basis of experience high to low.
   
6. *Capture 5 doctor details and taking screenshot of them*
   - Capturing 5 doctor details and print in console.
   - Take screenshot of the doctor details.
 
5. *Click on Surgeries*
   - Scroll down to extract all the popular surgeries and store them in a list.
 
6. *Click on For Corporates*
   - Click on For Corporates.
   - Fill all the valid details and capture the Thank You message.
 
7. *Provide a invalid login details*
   - Provide an invalid email-id and print the error message in the console .
 
## How to Run the Tests
 
1. *Open Eclipse IDE:*
   - Launch Eclipse IDE on your machine.
 
2. *Import Project:*
   - Select File -> Import from the menu.
   - Choose Existing Maven Projects and click Next.
   - Browse to the directory where you cloned the repository and select the project.
 
3. *Update Maven Project:*
   - Right-click on the project in the Project Explorer.
   - Choose Maven -> Update Project.
   - Click OK to update dependencies.
 
4. *Set Up Configuration:*
   - Open the src/test/resources/config.properties file.
   - Update any configuration parameters like browser type, URLs, etc., as needed.
 
5. *Run Test Suite:*
   - Locate the test suite file (e.g., src/test/java/TestSuite.java).
   - Right-click on the file and choose Run As -> TestNG Suite.
 
6. *View Reports:*
   - After execution, open the test-output folder.
   - Find the Extent Report HTML file (index.html) for detailed test reports.
 
## Author Information
 
- *Semanti Mukherjee*
 
## Disclaimer
 
This project is intended for educational and testing purposes only. The authors are not responsible for any unauthorized use or modification of the code. Use at your own risk.