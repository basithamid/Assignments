package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ChatRoom {
	static boolean isLoggedIn = false;
	static String loggedInUser="";
	public static void main(String args[]){
		int i;
		String chatRoom;
		
		HashMap<String, HashSet<String>> chatroomUsers = new HashMap<>();
		HashMap<String, ArrayList<String>> chatroomMessages = new HashMap<>();
		HashSet<String> chatRooms = new HashSet<>();
		HashMap<String,String> login = new HashMap<>();
		ArrayList<String> messageList = new ArrayList<>();
		while(true){
			Scanner scan = new Scanner(System.in);
			System.out.println("A. Create a Chatroom\nB. Add user\nC. User Login\nD. Send a message\nE. Display messages from specific chatroom\nF. List user belonging to specific chatroom\nG. Logout\nH. Delete user\nI. Delete chartoom");
			char choice=scan.next().charAt(0);
			switch(choice){
			case 'A':
				System.out.println("Enter name for chatroom:");
				chatRoom = scan.next();
				chatRooms.add(chatRoom);
				chatroomMessages.put(chatRoom,null);
				break;
				
			case 'B':
				System.out.println("Enter Username:");
				String uname = scan.next();
				System.out.println("Enter Password:");
				String pass = scan.next();
				login.put(uname, pass);
				break;
				
			case 'C':
				System.out.println("Enter Username:");
				uname = scan.next();
				System.out.println("Enter Password:");
				pass = scan.next();
				Iterator itr = login.entrySet().iterator();
				while(itr.hasNext()){
					Map.Entry pair = (Map.Entry)itr.next();
					if(pair.getKey().equals(uname) && pair.getValue().equals(pass)){
						isLoggedIn=true;
						loggedInUser=uname;
						System.out.println("User loggin in");
					}
					else{
						System.out.println("Username and Password are invalid");
					}
				}
				break;
				
			case 'D':
				System.out.println("Enter chatroom where you want to send a message:");
				chatRoom=scan.next();
				System.out.println("Messages:"+messageList);
				
				String message;
				if(chatroomMessages.get(chatRoom)==null){
					
					System.out.println("Enter message:");
					message= scan.next();
					messageList.add(message);
					chatroomMessages.put(chatRoom, messageList);
				}
				else{
					message=scan.next();
					messageList.add(message);
					chatroomMessages.replace(chatRoom, messageList);
				}
				
				break;
				
			case 'E':
				itr= chatRooms.iterator();
				i=1;
				while(itr.hasNext()){
					System.out.println(i+":"+itr.next());
				}
				System.out.println("Please select chatroom who's messages you want to display:");
				chatRoom=scan.next();
				System.out.println(chatroomMessages.get(chatRoom));
				break;
				
			case 'F':
				itr = chatRooms.iterator();
				i=1;
				while(itr.hasNext()){
					System.out.println(i+":"+itr.next());
					i++;
				}
				System.out.println("Please select chatroom who's messages you want to display:");
				chatRoom=scan.next();
				System.out.println(chatroomUsers.get(chatRoom));
				break;
				
			case 'G':
				loggedInUser="";
				isLoggedIn=false;
				break;
				
			case 'H':
				System.out.println("Enter name of user to be deleted");
				String name=scan.next();
				chatroomUsers.remove(name);
				break;
				
			case 'I':
				System.out.println("Enter chatroom to be deleted");
				chatRoom = scan.next();
				chatRooms.remove(chatRoom);
				chatroomMessages.remove(chatRoom);
				chatroomUsers.remove(chatRoom);
				break;
			}
		}
	}
}
