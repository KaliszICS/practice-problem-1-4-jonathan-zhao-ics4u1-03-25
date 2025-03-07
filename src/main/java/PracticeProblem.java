import java.io.*;

public class PracticeProblem {

	public static void main(String args[]) {
		System.out.print(getNumber(10, "file.txt"));
	}

	public static String getName(int Line, String file){
	BufferedReader br = null;
	String name = "";
	int count = 0;
	try	{
		br = new BufferedReader (new FileReader(file));
			for (int c = 0; c<Line; c++){
				name = br.readLine();
		}
			if (name ==null){
				name = "";
				return name;
	}
			for (int s = 0; s<name.length();s++){
				if (count ==2){
				name = name.substring(0, s-1);
				s = 100;
	}
		else if (name.charAt(s)==' '){
			count++;
		}
	}
}
	catch(IOException e){
				System.out.println(e);
 	}finally{
			try{		
				if (br!=null){
				br.close();
		}
	} catch(IOException e) {
		System.out.println(e);
	}
}
		return name;
	}

	public static int getAge(int Line, String file){
		int age = 0;
		BufferedReader br = null;
		String name = "";
		int count = 0;
		int countAge = 0;
		int ageStart = 0;
	try{
		br = new BufferedReader (new FileReader(file));
			for (int c = 0; c<Line; c++){
				name = br.readLine();
	
	}
			if (name ==""||name==null){
				age = -1;
				return age;
	}
			for (int s = 0; s<name.length();s++){
			if (count ==3){
			for (int j = 0; j<name.length();j++){
			if (countAge ==2){
				ageStart = j;
				j = 100;
	}else if (name.charAt(j)==' '){
			countAge++;
		}
	}
		name = name.substring(ageStart, s-1);
		System.out.println(name + " and " + ageStart);
		s = 100;

	} else if (name.charAt(s)==' '){
		count++;
		}
	}
		} catch(IOException e) {
			System.out.println(e);
			} finally {
				try{		
					if (br!=null){
					br.close();
		}
	} catch(IOException e) {
			System.out.println(e);
	}
}
	age = Integer.parseInt(name);
	return age;

}

public static int getNumber(int Line, String file){
	int number = 0;
	BufferedReader br = null;
	String name = "";
	int countNum = 0;
		try{
			br = new BufferedReader (new FileReader(file));
			for (int c = 0; c<Line; c++){
				name = br.readLine();
	
	}
		if (name =="" ||name==null) {
			number = -1;
			return number;
	}
			for (int j = 0; j<name.length();j++){
				if (countNum ==3){
					name= name.substring(j);
					j = 100;
		} else if (name.charAt(j)==' ') {
			countNum++;
	}
}

	} catch(IOException e) {
		System.out.println(e);
	} finally {
			try{		
				if (br!=null){
				br.close();
		}
	} catch(IOException e) {
		System.out.println(e);
	}
}
	number = Integer.parseInt(name);
		return number;
}

public static void fileAppend(String output, String filename){
	BufferedWriter bw = null;
	try {
		bw = new BufferedWriter(new FileWriter(filename, true));
		bw.write(output);
	} catch (IOException e) {
		System.out.println(e);
	} finally {
		try {
			if (bw != null);
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}


}


