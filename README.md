History App Report

Purpose of the app

The purpose of the history application (app) is to compare the age of the user to a well-known person in history both in the past and present day. The app will be used by students who will compare their ages to the well-known personalities who have passed on. 

Design Considerations of the app

The things I will consider for the design of the app will be the presentation of the UI, the software I will be using to design the app, the website I will be using to do the automated testing of the app so that it runs smoothly without giving the user any issues.

The software that will be used for the creation of the app will be Android Studio, Github for the automated testing and the pushing of the code.

Firstly I will go to the website labs.azure.com/virtualmachines to register on their site to use their virtual machine as the Android Studio software requires a lot of RAM to run all its functions. 
Figure 1 Azure Lab Homepage

After landing on the homepage of AzureLabs you will toggle on the switch of your virtual machine so that you can be able to access your virtual computer. Booting up the virtual machine may be a bit of a long process as the virtual machine relies on the internet connection strength of the network you are connected to.

After successfully switching on the virtual machine you will be prompted to create a password for your virtual machine if you have not created yet. 
 
Figure 2Azure Labs Credential Login

After creating your password for your virtual machine you will land on the desktop of your virtual machine. The figure below is the desktop of the virtual machine. 
Figure 3 Virtual Machine Desktop

After landing on the desktop of the virtual machine I was required to do the following before opening the Android Studio app: I will be required to open the emulator app Bluestacks, then go into settings find the advanced option in that tab a port number will be shown. The port number will either be 5555 or 5556. After finding the port number you will open the batch file named emulator and you will enter the port number displayed in the advanced settings tab of Bluestacks. The purpose of the emulator is to see how the app will function whilst creating the code for the desired app.
 
Figure 4 Bluestacks Homepage

 
Figure 5 Bluestacks Settings page

 
Figure 6Bluestacks emulator port number

 
Figure 7After entering the port number

After enabling the emulator you then open the app Android Studio to begin with your project. After opening the app you will select the create a new project after selecting create a new project you will use empty views activity to create the app. After selecting empty views activity you will be required to give the application a name. after name the app you will land on the activity_main.xml tab. In this tab you will be able to create the UI of your app. Whilst in this tab you will go to the design tab and add the elements required for the project. In this instance the elements required for the app were a editable text element, two textview elements and two buttons.

 
Figure 8 New project
 
Figure 9 New Project Activity Selection

 
Figure 10 Naming of project
 
Figure 11 Activity_main.xml tab

 
Figure 12 Design tab of activity_main.xml with the required elements

In the MainActivity tab is where the code for the app will be. When starting to code in the MainActivity tab you first have to declare all the elements you have used in the activity_main.xml tab. After the declaration of the variables you will then enter the .setOnClickListen{} code to create the code of the generate and clear button. For the generate button you will use the if else statement to compare the different data set you have compiled. The data set in this app is a list of well known people who have passed on. The purpose of the if else statement is to compare the variable that will be entered by the user to see if it will match with any of the items in the data set. If a user enters a variable that is outside the range of the data set the app will produce an error message informing the user that the value that they have enter is Invalid. The code for the clear button will go below the if else statement outside the code for the generate button.

 
Figure 13Declaration of elements used

 
Figure 14 Functionality code for the generate button 
Figure 15If else statement comparing the data set.

 
Figure 16Code for the Clear button.

Utilisation of Github and Github actions

After the app has been created and tested it will then be pushed to a Github repository where it can be seen by the public or kept private. After posting the code on Github you will then run the automated testing whereby the app will run seamlessly without any errors. The code will automatically update itself if changes are made in the MainActivity tab.


 
List of the well-known individuals.


 
Figure 17Elizabeth Taylor

 Dame Elizabeth Rosemond Taylor DBE (27 February 1932 – 23 March 2011) was a British and American actress. She began her career as a child actress in the early 1940s and was one of the most popular stars of classical Hollywood cinema in the 1950s. She then became the world's highest paid movie star in the 1960s, remaining a well-known public figure for the rest of her life. In 1999, the American Film Institute ranked her seventh on its greatest female screen legends list.(Wikipedia)
 
 
Figure 18 Heath Ledger

Heath Andrew Ledger (4 April 1979 – 22 January 2008) was an Australian actor. After playing roles in several Australian television and film productions during the 1990s, he moved to the United States in 1998 to further develop his film career. His work consisted of 20 films in a variety of genres, including 10 Things I Hate About You (1999), The Patriot (2000), A Knight's Tale (2001), Monster's Ball (2001), Casanova (2005), Lords of Dogtown (2005), Brokeback Mountain (2005), Candy (2006), I'm Not There (2007), The Dark Knight (2008), and The Imaginarium of Doctor Parnassus (2009), the latter two of which were posthumously released.[1] He also produced and directed music videos and aspired to be a film director[2]
 .(Wikipedia)
 
Figure 19 Maya Angelou
Maya Angelou (/ˈændʒəloʊ/ ⓘ AN-jə-loh;[1][2] born Marguerite Annie Johnson; April 4, 1928 – May 28, 2014) was an American memoirist, poet, and civil rights activist. She published seven autobiographies, three books of essays, several books of poetry, and is credited with a list of plays, movies, and television shows spanning over 50 years. She received dozens of awards and more than 50 honorary degrees.[3] Angelou's series of seven autobiographies focus on her childhood and early adult experiences. The first, I Know Why the Caged Bird Sings (1969), tells of her life up to the age of 17 and brought her international recognition and acclaim.(Wikipedia)

 
Figure 20 Michael J. Jackson

Michael Joseph Jackson (August 29, 1958 – June 25, 2009) was an American singer, songwriter, dancer, and philanthropist. Known as the "King of Pop", he is regarded as one of the most significant cultural figures of the 20th century. During his four-decade career, his contributions to music, dance, and fashion, along with his publicized personal life, made him a global figure in popular culture. Jackson influenced artists across many music genres. Through stage and video performances, he popularized complicated street dance moves such as the moonwalk, which he named, as well as the robot.(Wikipedia)

 
Figure 21Queen Mother Elizabeth Bowes-Lyon

Elizabeth Angela Marguerite Bowes-Lyon[b] (4 August 1900 – 30 March 2002) was Queen of the United Kingdom and the Dominions of the British Commonwealth from 11 December 1936 to 6 February 1952 as the wife of King George VI.
 
Figure 22Prince Phillip
Prince Phillip was the Duke of Edinburgh ( consort to Queen Elizabeth ) from 1952-2021.

 
Figure 23Steve Irwin

Steve Irwin was a austrailian zookeeper and conservasionist.

 
Figure 24Nelson R. Mandela

Nelson Mandela was the first black president of the RSA.



 
Figure 25 Theodore Roosevelt

Theodore Roosevelt Jr.[b] (October 27, 1858 – January 6, 1919), often referred to as Teddy or by his initials, T. R., was an American politician, statesman, conservationist, naturalist, and writer who served as the 26th president of the United States from 1901 to 1909.(Wikipedia)
https://youtu.be/SZolwzcb2FQ?si=LcqHAuE3p8vTJVJwhttps://youtu.be/SZolwzcb2FQ?si=LcqHAuE3p8vTJVJw
