# Election Machine

**This is our school project for Server Programming course.**  
  
**Team: [Jenna Hakkarainen](https://github.com/jenhakk), [Amanda Karjalainen](https://github.com/amakarj), [Anna-Maria Palm](https://github.com/A-d-f)**

## Description
The task was to make an election machine using **Java**, **JSP**, **HTML** and **Servlets**. The project is divided between **Server Programming** and **Web Services** courses. The web application in this repository is created first and it works as a base. The application implemented for Web Services course supplements the features and uses some different techniques. The repository for the application created in Web Services, can be found from [**here**](https://github.com/amakarj/TheElectionMachineRest). 

We ave used **Scrum** for the development process. **There were four features to choose from** and the idea was to implement at least one per course. 

#### The features were:

 -  Admin can add, edit and remove candidates.
 -  Admin can add, edit and remove questions.
 -  Candidate can answer the questions and edit and delete their answers.
 -  End user (voter) can answer the questions and see which candidate is the best match for them.

**We decided to make candidate's and voter's view.** Admin features will be created in the other project (see the link above).  
Candidate can answer questions, and edit and delete answers. They can also see their profile and edit their personal information.  
The voter can answer questions and browse candidates. After answering questions, they'll see three the most suitable candidates based on their answers.

We started the project by deciding how the features would be implemented and what the site would look like. We designed the layout with **Figma**. Here is the link to [Figma](https://www.figma.com/file/OV6hQmNGV3PbAVEQjBtPgV/Election-Machine-Frontpage?node-id=0%3A1).

## End users view

On the front page, the user can choose from three different functions: **Browse candidates**, **Answer questions** and **Are you a candidate?**  
First two buttons are for the voter. When the user clicks Browse candidates button, they will be directed to a page where all candidates are listed. Candidate's information comes from a servlet which reads data from database using DAO class' method. The user can select one of the candidate and see more specific information about them. They can additionally check candidate's answers. 

#### As in all of our projects, here are some extra features we've implemented:

* Error page
* Overall investing in visual appearance
* Candidate can edit their personal information
* MVC model
* Dao
* CRUD (with prepared statements)
* JSP core library
* Scriplets
* Dump file from the database

## Conclusion
The project was rewarding to make and we learnt many new things. The schedule was thight since we had only few weeks to create it. The most difficult part was saving the candidate's and voter's answers. We didn't get much information about it from the course material but we solved the problem by using scriplets in JSP files.

In the [**next part**](https://github.com/amakarj/TheElectionMachineRest) of this project, we will continue with admin features.
