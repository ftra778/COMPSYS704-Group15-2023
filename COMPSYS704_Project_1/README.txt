###### COMPSYS 704 Group 15: Project 1 #####
WARNING: The overall ABS is very buggy and does not work properly. Separately, all ABS components work, and can be tested in their separate files. Buttons in their GUI's may need multiple
clicks to send the signal since they may not be read by the program

OVERALL ABS INSTRUCTIONS:
1.   Right click the 'BuildAll.launch' file and run it. 
2.   Click the 'COMPSYS704_Project_1' and refresh the project by either pressing F5 or rihgt-clicking and selecting 'Refresh' 
3.   Right click the 'RunController.launch' and 'RunPlant.launch' files and run them in this order
4.   Once 'RunPlant.launch' is launched, many separate GUI's will appear. The GUI titled 'ABS' is the overall system (5), and the rest are each component that can be 
     either visualized when using the overall ABS, or can be used separately

ABS
5.1  Click on the 'Empty Bottle Ready' signal to tell the Baxter robot to place an empty bottle on the conveyor belt
5.2  Click the 'Enable' button to enable the step-by-step functionality of each ABS component

Conveyor
6.1  C

Rotary Table
7.1  C

Filler
8.1  Currently Filler does not have a GUI but will print to the console the percentages of which liquid is being dispensed

Cap Loader
9.1  Either receive a bottle from the Filler or send a bottle straight to the Cap Loader by clicking the 'request' button
9.2  Click 'enable' to observe each stage of the Cap Loader's functionality, or follow the steps yourself by enabling Manual mode by clicking the 'Manual' radio button

Capper
10.1 Either receive a bottle from the Cap Loader or send a bottle straight to the Capper by clicking the 'Bottle Ready' button
10.2 Click 'enable' to observe each stage of the Cap Loader's functionality, or follow the steps yourself by enabling Manual mode by clicking the 'Manual' radio button

ECS
11.1 Click 'Update' to uupdate the current environment conditions with the initial conditions
11.2 To set your custom environment state, adjust the sliders or type the time (24HR) and click 'Update' to observe changes to the actuators on the GUI
