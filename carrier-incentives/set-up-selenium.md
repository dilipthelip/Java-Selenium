## Steps to Create a test case for a page:

### Step 1:

- Create a Java class in the objects folder.
  - Capture all the elements.
  - Declare a WebElement for each element in this file.
  - Capture the Xpath and assign it to the findBy attribute in the Objects class.

### Step 2:

- Write a JUnit test case for that page.
- Get the Driver.
- Check all the elements are available in that page.

### Step 3:
- Read the data from the excelsheet.
- Run validations by passing data that is read from the spread sheet, clicking buttons etc.,
