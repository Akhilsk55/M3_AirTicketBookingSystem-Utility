<<<<<<< HEAD
package com.ltts.flight.main;
import com.ltts.flight.pflight.*;
=======
package com.ltts.flight;
import com.ltts.Flight.start.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

>>>>>>> d780d41c63b5faf5885bcbc9bf33be92a8c984a3
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	   List<Flight> flights;
	    public Main()
	    {
	       flights = new ArrayList<Flight>();
	    }
	public void letShow()
	{
		System.out.println("********************************************");
		System.out.println("**    AIRLINE TICKET BOOKING SYSTEM      **");
		System.out.println("********************************************");
		System.out.println("** [1] ADD FLIGHT                        **");
		System.out.println("** [2] VIEW DESTINATIONS                 **");
		System.out.println("** [3] RESERVATION                       **");
		System.out.println("** [4] PAYMENT                           **");
		System.out.println("** [5] MY BOOKINGS                       **");
		System.out.println("** [6] Exit                              **");
		System.out.println("********************************************");
		System.out.println("********************************************\n");

	}
    
    public void createFlights() {
        int FN, c; double op;
        String origin, destination, dt;
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter flight Number");
        FN = scan1.nextInt();
        System.out.println("Enter flight origin");
        origin = scan2.nextLine();
        System.out.println("Enter flight destination");
        destination = scan2.nextLine();
        System.out.println("Enter flight departure time and date");
        dt = scan2.nextLine();
        System.out.println("Enter flight capacity");
        c = scan1.nextInt();
        System.out.println("Enter original price of ticket");
        op = scan3.nextDouble();
        Flight F = new Flight(FN, origin, destination, dt, c, op);
        flights.add(F);
        System.out.println("The following flight has been created:");
        System.out.println(F);
        

    }

    public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Main M=new Main();

    String user,password,yn,search,again,choice;
    int to=0,y=1,z=0,end=0;
    int available[] = new int[6];
    int ticketI[][] = new int [100][3];
    String ticketS[][] = new String[100][3];
    double ticketD[][] = new double [100][3];
    double pay[] = new double[20];
    double change[] = new double[20];
    
    for(int i=1;i<4;){
		System.out.print("Enter User: (demo) ");
		user = in.readLine();
		System.out.print("Enter Password: (demo) ");
		password = in.readLine();
    	for(int o=1; o<=5; o++){
    		available[o]=20;
  		}
    
    	if(user.equals("demo") && password.equals("demo")){
    	
    		for(int x=1; x==1;){
    			M.letShow();
    	
    			for(x=1; x==1;){
					System.out.print("ENTER CHOICE: ");
					choice=in.readLine();
					
					if (choice.equals("1"))
					{
						M.createFlights();
						M.letShow();
					}
					else if (choice.equals("2"))
					{
    					System.out.println("***************************************");
						System.out.println("**   DESTINATION   |   FARE  |  SEAT  **");
						System.out.println("***************************************");
						System.out.println("** 1.)MUMBAI       | Rs.1200 |   "+available[1]+"   **");
						System.out.println("** 2.)DELHI        | Rs.1270 |   "+available[2]+"   **");
						System.out.println("** 3.)KARNATAKA    | Rs.2150 |   "+available[3]+"   **");
						System.out.println("** 4.)KERALA       | Rs.1200 |   "+available[4]+"   **");
						System.out.println("** 5.)PUNJAB       | Rs.2250 |   "+available[5]+"   **");
						System.out.println("***************************************");
						System.out.println("***************************************\n");
						System.out.println("PWD, STUDENT, & SENIOR CITIZEN with 20% DISCOUNT!!!\n");
    					x=0;
    					
					}
					
				
					else if (choice.equals("3")){
						int print=1;
						System.out.println("***************************************");
						System.out.println("**   DESTINATION   |   FARE  |  SEAT  **");
						System.out.println("***************************************");
						System.out.println("** 1.)MUMBAI       | Rs.1200 |   "+available[1]+"   **");
						System.out.println("** 2.)DELHI        | Rs.1270 |   "+available[2]+"   **");
						System.out.println("** 3.)KARNATAKA    | Rs.2150 |   "+available[3]+"   **");
						System.out.println("** 4.)KERALA       | Rs.1200 |   "+available[4]+"   **");
						System.out.println("** 5.)PUNJAB       | Rs.2250 |   "+available[5]+"   **");
						System.out.println("***************************************");
						System.out.println("***************************************\n");
						System.out.println("PWD, STUDENT, & SENIOR CITIZEN with 20% DISCOUNT!!!\n");
    					if((available[1]==0)&&(available[2]==0)&&(available[3]==0)&&(available[4]==0)&&(available[5]==0)){
    						System.out.println("Sorry, We don't  have available seats for all Destination!");
    						x=0;
    						
    					}
    					
    					else{
    					for(x=1; x==1;){
    						System.out.print("\nENTER PASSENGER'S NAME: ");
    						ticketS[z][0] = in.readLine();
							
							x=0;
							
    						for(int l=0; l<z; l++){
    							if(ticketS[l][0].equalsIgnoreCase(ticketS[z][0])){
    								System.out.println("Sorry, Passenger's name have already used!");
    								x=1;
    							}
    						}
    					}
    			
    					for(x=1; x==1;){
    						System.out.print("ENTER DESTINATION: Eg:1,2");
    						to = Integer.parseInt(in.readLine());
    						
    						if(to<1 || to>5){
    							System.out.println("Invalid Input!");
    							x=1;
    						}
    					
    						for(int d=1; d<=5; d++){
    							if(to==d){
    								if(available[to]==0){
    									System.out.println("Sorry, We don't have available seat!");
    									x=1;
    								}
    								x=0;
    							}
    						}
    					}
    					
    					
    					String dest[] = { " ", "MUMBAI", "DELHI", "KARNATAKA", "KERALA", "PUNJAB"};
    					double fare[] = { 0,1200,1270,2150,1200,2250};
    		
    				
    					ticketS[z][1] = dest[to];
    					ticketD[z][0] = fare[to];
    				
    					for(x=1; x==1;){
    					System.out.print("HOW MANY PASSENGERS ARE THERE?: ");
    					ticketI[z][0] = Integer.parseInt(in.readLine());
    		
    						for(int p=1; p<=5; p++){
    							if(to==p){
    								print=1;
    								available[to] = available[to]-ticketI[z][0];
    							
    								if(available[to]<0){
    									System.out.print("Sorry, We don't have seat available for " +ticketI[z][0] +" person\n");
    									available[to] = available[to]+ticketI[z][0];
    									System.out.print("We only have " +available[to] +" seat available\n");
    									x=1;
    									print=0;
    								}
    								else{
    									x=0;
    								}
    							}
    						}
    		
    					}
    				
    					for(x=1;x==1;){
    						System.out.print("HOW MANY PASSENGERS HAVE DISCOUNT?: ");
    						ticketI[z][1] = Integer.parseInt(in.readLine());
    					
    						if(ticketI[z][1]>ticketI[z][0]){
    							
    							System.out.println("Invalid Input!");
    							System.out.println("No. of Passengers are only " +ticketI[z][0] +"!");
    						x=1;
    						}
    						else{
    							break;
    						}
    					}
    		
    	
    					if(print==1){
    						System.out.println("\n***************************************");
    						System.out.println("**        PASSENGER'S DETAILS        **");
    						System.out.println("***************************************");
    						System.out.println("PASSENGER'S NAME: " + ticketS[z][0]);
    						System.out.println("PASSENGER'S DESTINATION : " + ticketS[z][1]);
    						System.out.println("FARE PRICE: Rs. " + ticketD[z][0]);
    						System.out.println("NO. OF PASSENGERS: " + ticketI[z][0]);
    						System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + ticketI[z][1]);
    						System.out.println("***************************************");
    						System.out.println("***************************************\n");
    						ticketS[z][2]="0";
    						double discount=(ticketD[z][0]-(ticketD[z][0]*0.2))*ticketI[z][1];
    						ticketD[z][2]= ((ticketI[z][0]-ticketI[z][1])*ticketD[z][0])+discount;
    						x=0;
    					}
    					z++;
    					}
					}
					
					else if (choice.equals("4")){
			          
			            
						for(x=1; x==1;){
							
								System.out.print("ENTER PASSENGER'S NAME: ");
								search = in.readLine();
								
								
								int s=1;
								for(int b=0;b<z;b++){
									if(search.equalsIgnoreCase(ticketS[b][0])){
										System.out.println("***************************************");
	    								System.out.println("**        PASSENGER'S DETAILS        **");
	    								System.out.println("***************************************");
	    								System.out.println("PASSENGER'S NAME: " + ticketS[b][0]);
	    								System.out.println("PASSENGER'S DESTINATION : " + ticketS[b][1]);
	    								System.out.println("FARE PRICE: Rs." + ticketD[b][0]);
	    								System.out.println("NO. OF PASSENGERS: " + ticketI[b][0]);
	    								System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + ticketI[b][1]);
		 		   						System.out.println("***************************************");
	    								System.out.println("***************************************");
	    								s=0;
										x=0;
										
										if(ticketS[b][2].equals("x")){
	    									System.out.println("Passenger's Already Paid!");
	    									x=0;
	    								}
	    								else{
	    									ticketS[b][2]="x";
	    									
	    								
	    									for(x=1; x==1;){
	    										System.out.println("\nPASSENGER'S TOTAL FARE: Rs. "+ticketD[b][2]);
	    										System.out.print("ENTER AMOUNT TO PAY: ");
	    										pay[b] = Double.parseDouble(in.readLine());
	    										change[b]=pay[b]-ticketD[b][2];
	    							
	    										if(change[b]<0){
	    											System.out.println("Invalid Input!");
	    											x=1;
	    										}
	    										else{
	    											System.out.println("CHANGE: Rs. "+change[b]);
	    											System.out.println("");
	    											x=0;
	    										}
	    									}
										}
									}
								}
								if (s==1){
									System.out.println("\nPASSENGER'S NAME NOT FOUND!\n");
									for(int q=1; q==1;){
									
									System.out.print("Do you wish to continue with this transaction? [Y/N]: ");
									again=in.readLine();
									
									if(again.equalsIgnoreCase("y")){
										q=0;
									}
									else if (again.equalsIgnoreCase("n")){
										q=0;
										x=0;
										
									}
									else{
										System.out.println("\nInvalid input!\n");
									}
								
						
								}
							}	
						}
			            
					}
					
					else if (choice.equals("5")){
						
						
						for(int sx=1; sx<=3;){
 						System.out.print("SEARCH PASSENGER'S NAME: ");
    					search = in.readLine();
    		    
    		 		   	int s=1;
							for(x=0; x<=z; x++){
								if(search.equalsIgnoreCase(ticketS[x][0])){
									System.out.println("***************************************");
    								System.out.println("**        PASSENGER'S DETAILS        **");
    								System.out.println("***************************************");
    								System.out.println("PASSENGER'S NAME: " + ticketS[x][0]);
    								System.out.println("PASSENGER'S DESTINATION : " + ticketS[x][1]);
    								System.out.println("FARE PRICE: Rs." + ticketD[x][0]);
    								System.out.println("NO. OF PASSENGERS: " + ticketI[x][0]);
    								System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + ticketI[x][1]);
    								System.out.println("TOTAL FARE PRICE: Rs. " + ticketD[x][2]);
    								if(ticketS[x][2].equals("x")){
    									System.out.println("PAY: Rs. " +pay[x]);
    									System.out.println("CHANGE: Rs. " +change[x]);
    									System.out.println("STATUS: PAID");
    								}
    								else{
    									System.out.println("STATUS: NOT PAID");
    								}
    								System.out.println("***************************************");
    								System.out.println("***************************************");
    								s=0;
								    sx=4;
								}
							}	
						
							
							if (s==1){
								System.out.println("Passenger's Name not found!");
								sx++;
							}
							
				    	}
					}		
					
					else if(choice.equals("6")){
						end=1;
						x=0;
						System.out.println("Thank You!");
					}
				
					else{
						System.out.println("Invalid Input!");
						x=1;
					}
    			
				}

    			for(y=1; y==1;){
    				if(end==1){
    					break;
    				}
    				System.out.print("Do you want another transaction? [Y/N]: ");
   				 	yn = in.readLine();
    	
    				if (yn.equalsIgnoreCase("y")){
    					x=1;
    					y=0;
    				}
    				else if (yn.equalsIgnoreCase("n")){
    					System.out.println("\nThank You!!!");
    					break;
    				}
    				else{
    					System.out.println("Invalid Input!!!");
    					y=1;
    				}
    			}
    		}
    		i=4;
    	}
    	else{
    		System.out.println("\nInvalid user or password!\n");
    		i++;
		}
	
    }
    
    }
    
    
}
