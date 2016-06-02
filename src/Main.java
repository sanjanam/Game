import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static void cal(int n) {
		if (n % 2 == 0) {
			int[] a = new int[n];
			for (int i = 1; i <= n; i++)
				a[i - 1] = i;
			for (int day = 1; day <= n - 1; day++) {
				System.out.println("\n");
				System.out.print(day);
				
				for (int i = 1; i <= n / 2; i++) {
					if(i==a[i-1]){
						System.out.print(":");
					System.out.print(a[n - i]);
					
					}
					else{
						for(int k=1;k<=n;k++){
							if(i==a[k-1]){
								System.out.print(":");
								System.out.print(a[n - k]);
								
								
							}
						}
					}
				}
	for (int i = n/2+1; i <= n; i++) {
					
					if(i==a[i - 1]){
						System.out.print(":");
						System.out.print(a[n-i]);
						
					}
						
						//bw.write((new Integer(a[n - i])).toString());bw.write("\t");}
					
					else{
						for(int k=1;k<=n;k++){
							if(i==a[n-k]){
								System.out.print(":");
								System.out.print(a[k-1]);
								
								//bw.write((new Integer(a[k-1])).toString());
								//bw.write("\t");
							}
						}
						
					}
					
					
				}
				
				int temp = a[n - 1];
				int[] x = new int[n];
				x[0] = a[0];
				for (int i = 1; i <= n - 2; i++) {
					x[i + 1] = a[i];

				}
				x[1] = temp;
				a = x;
				/*
				 * for(int k=0;k<n;k++) System.out.println("**"+ a[k]);
				 */
			}
		} else {
			n = n + 1;
			int[] b = new int[n];
			for (int i = 1; i <=n; i++)
				b[i - 1] = i;
			
			for (int day = 1; day <= n - 1; day++) {
				System.out.println("\n");
				System.out.print(day);
				for (int i = 1; i <= n / 2; i++) {

					if(i==b[i-1]){
						if(b[n-i]==n)
						{
							System.out.print(":");
							System.out.print("-");
							
						}
						else{
							System.out.print(":");
							System.out.print(b[n - i]);
								
						}
					
						}
						else{
							for(int k=1;k<=n;k++){
								if(i==b[k-1]){
									if(b[n-k]==n){
										System.out.print(":");
										System.out.print("-");
										
									}
									else{
										System.out.print(":");
										System.out.print(b[n - k]);
										
											
									}
									
								}
							}
						}
						//System.out.print(b[i - 1] + " " + b[n - i]);
				}
	for (int i = n/2+1; i <n; i++) {
					
		if(i==b[i - 1]){
			if(b[n-i]==n){
				System.out.print(":");
				System.out.print("-");
					
			}
			else{
				System.out.print(":");
				System.out.print(b[n-i]);
					
			}
			
		}
			
			//bw.write((new Integer(a[n - i])).toString());bw.write("\t");}
		
		else{
			for(int k=1;k<=n;k++){
				if(i==b[n-k]){
					if(b[k-1]==n)
					{ System.out.print(":");
						System.out.print("-");
						
					}
					else{
						System.out.print(":");
						System.out.print(b[k-1]);
						
					}
					
					//bw.write((new Integer(a[k-1])).toString());
					//bw.write("\t");
				}
			}
			
		}
							
				}
				
				//System.out.println();
				int temp = b[n - 1];
				int[] x = new int[n];
				x[0] = b[0];
				for (int i = 1; i <= n - 2; i++) {
					x[i + 1] = b[i];

				}
				x[1] = temp;
				b = x;
				/*
				 * for(int k=0;k<n;k++) System.out.println("**"+ b[k]);
				 */
			}

		}

	}

	static void cal1(int n) throws Exception {
		
		if (n % 2 == 0) {
			int[] a = new int[n];
			for (int i = 1; i <= n; i++)
				a[i - 1] = i;
			
			File file = new File("output.txt");
			//if (!file.exists()) {
				file.createNewFile();
			//}
			FileWriter fileWriter = new FileWriter(file,true);
			PrintWriter  bw = new PrintWriter(fileWriter);
			//bw.write("\n");
			//bw.write("\t");
		/*	for(int players=1;players<=n;players++)
			{
				
				bw.write((new Integer(players)).toString());
				bw.write("\t");
			}
			*/
			
			for (int day = 1; day <= n - 1; day++) {
				 //System.out.print(day+":");
				 bw.write("\n");
				bw.write((new Integer(day)).toString());
				//bw.write(":");
				for (int i = 1; i <= n/2 ; i++) {
					
					if(i==a[i-1]){
				
						bw.write(":");					
						bw.write((new Integer(a[n-i])).toString());
						
					
					}
					
					
					else{
						for(int k=1;k<=n;k++){
							if(i==a[k-1]){
								bw.write(":");
								bw.write((new Integer(a[n - k])).toString());
								
							}
						}
						
					}
				}
					/*bw.write((new Integer(a[i - 1])).toString());
					bw.write("\t");
					bw.write((new Integer(a[n - i])).toString());
*/				
				
					for (int i = n/2+1; i <= n; i++) {
					
					
					if(i==a[i - 1]){
						
						bw.write(":");
						bw.write((new Integer(a[n - i])).toString());}
					
					else{
						for(int k=1;k<=n;k++){
							if(i==a[n-k]){
								bw.write(":");
								bw.write((new Integer(a[k-1])).toString());
								
							}
						}
						
					}
					
					
				}
				//bw.newLine();
				// System.out.println();
				int temp = a[n - 1];
				int[] x = new int[n];
				x[0] = a[0];
				for (int i = 1; i <= n - 2; i++) {
					x[i + 1] = a[i];

				}
				x[1] = temp;
				a = x;
				/*
				 * for(int k=0;k<n;k++) System.out.println("**"+ a[k]);
				 */
			}
			bw.write("\n");
			for(int l=0;l<2*n;l++){
				bw.write("#");
			}
			bw.close();
		} else {
			n = n + 1;
			int[] b = new int[n];
			for (int i = 1; i <= n; i++)
				b[i - 1] = i;
			File file = new File("output.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fileWriter = new FileWriter(file,true);
			PrintWriter  bw = new PrintWriter(fileWriter);
			bw.write("\n");
			//bw.write("\t");
			/*for(int players=1;players<n;players++)
			{
				bw.write(":");
				bw.write((new Integer(players)).toString());
			
			}*/
			
			
			for (int day = 1; day <= n - 1; day++) {
				 //System.out.print(day+":");
				 bw.write("\n");
				bw.write((new Integer(day)).toString());
				
				for (int i = 1; i <= n/2 ; i++) {
					
					if(i==b[i-1]){
				
									if(b[n-i]==n){
										bw.write(":");
										bw.write("-");
										
									}
									else{
										bw.write(":");
										bw.write((new Integer(b[n-i])).toString());
											
									}
						
					
					}
					
					
					else{
						for(int k=1;k<=n;k++){
							if(i==b[k-1]){
								if(b[n-k]==n){
									bw.write(":");
									bw.write("-");
									
								}else{
									bw.write(":");	
									bw.write((new Integer(b[n - k])).toString());
									
								}
								
							}
						}
						
					}
				}
					/*bw.write((new Integer(a[i - 1])).toString());
					bw.write("\t");
					bw.write((new Integer(a[n - i])).toString());
*/				
				
					for (int i = n/2+1; i < n; i++) {
					
					
					if(i==b[i - 1]){
						if(b[n-i]==n){
							bw.write(":");
							bw.write("-");
							
						}else{
							bw.write(":");
							bw.write((new Integer(b[n - i])).toString());
						}
						
						}
					
					else{
						for(int k=1;k<=n;k++){
							if(i==b[n-k]){
								if(b[k-1]==n){
									bw.write(":");
									bw.write("-");
									
								}
								else{
									bw.write(":");
									bw.write((new Integer(b[k-1])).toString());
										
								}
								
							}
						}
						
					}
					
					
				}
				//bw.newLine();
				// System.out.println();
				int temp = b[n - 1];
				int[] x = new int[n];
				x[0] = b[0];
				for (int i = 1; i <= n - 2; i++) {
					x[i + 1] = b[i];

				}
				x[1] = temp;
				b = x;
				/*
				 * for(int k=0;k<n;k++) System.out.println("**"+ a[k]);
				 */
			}
			bw.write("\n");
			for(int l=0;l<2*n;l++){
				bw.write("#");
			}
			bw.close();

		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice 1 for console 2 for file");
		int ch = s.nextInt();
		if (ch == 1) {
			System.out.println("Enter the value of n");
			int n = s.nextInt();
			if (n <=10)
				cal(n);
			else
				cal1(n);

		} else if (ch == 2) {
			//System.out.println("Enter File path");
			String fileName="ip.txt";
		// This will reference one line at a time
			
			String line = null;

			try {
				
				// FileReader reads text files in the default encoding.
				FileReader fileReader = new FileReader(fileName);

				// Always wrap FileReader in BufferedReader.
				BufferedReader bufferedReader = new BufferedReader(fileReader);

				while ((line = bufferedReader.readLine()) != null) {
					System.out.println("line-----------"+line);
					if(Integer.parseInt(line)<=10)
					cal(Integer.parseInt(line));
					else
						cal1(Integer.parseInt(line));	
				}
				// Always close files.
				bufferedReader.close();
			} catch (FileNotFoundException ex) {
				System.out.println("Unable to open file '" + fileName + "'");
			} catch (IOException ex) {
				System.out.println("Error reading file '" + fileName + "'");
				// Or we could just do this:
				// ex.printStackTrace();
			}
		} else
			System.out.println("Choose proper option");
	}
	
	catch(Exception ex){
		ex.printStackTrace();
	}
	}
}
