package first;
import java.util.LinkedList;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Hello2 {

	public static void main(String[] args) throws MyException {
		BigInteger a = new BigInteger("20000000");
		System.out.println(a);
		int b = 5;
		int c = Math.abs(5);
		System.out.println(c);
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		try
		{
			int d = b/c;
			if(b<0)
			{
				throw new MyException("The number is negtive",c);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
/*		int data[] = new int[6];
		ArrayList<Double> a1 = new ArrayList<Double>();
		a1.add(3.2);
		a1.add(3.4);
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		for(int i=0;i<10000;i++)
		{
			l1.add(i);
		}
		int i;
		long start = System.nanoTime();
		for(i=0;i<10000;i+=10)
		{
			l1.get(i);
			l1.get(i+1);
			l1.get(i+2);
			l1.get(i+3);
			l1.get(i+4);
			l1.get(i+5);
			l1.get(i+6);
			l1.get(i+7);
			l1.get(i+8);
			l1.get(i+9);
		}
		long end = System.nanoTime();
		System.out.println(end-start);		
		start = System.nanoTime();
		for(i=0;i<10000;i++)
		{
			System.out.println(l1.get(i));
		}
		end = System.nanoTime();
		System.out.println(end-start);
		start = System.nanoTime();
		for(Integer item : l1)
		{
			System.out.println(item);
		}
		end = System.nanoTime();
		System.out.println(end-start); */
		HashSet<Cat> hash = new HashSet<Cat>();
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		hash.add(new Cat(2,3));
		hash.add(new Cat(3,3));
		hash.add(new Cat(4,3));
		hash.add(new Cat(4,3));
		for(Cat ca : hash)
		{
			System.out.println(ca.num);
		}
		System.out.println(hash.size());
        Hashtable<Integer,String> hash2 = new Hashtable<Integer,String>();
        hash2.put(300, "cat");
        hash2.put(400,"dog");
        hash2.put(500,"pig");
        Iterator<Integer> has = hash2.keySet().iterator();
        Integer key;
        String str;
        while(has.hasNext())
        {
        	key = has.next();
        	System.out.println(key);
        	str = hash2.get(key);
        	System.out.println(str);
        }
        System.out.println(hash2.containsKey(400));
        Random ran = new Random();
        int arr[] = new int[6];
        for(int i=0;i<6;i++)
        {
        	arr[i] = ran.nextInt(100);
        }
        for(int i=0;i<6;i++)
        {
        	System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<6;i++)
        {
        	System.out.println(arr[i]);
        }
        LinkedList<Cat> sc = new LinkedList<Cat>();
        sc.add(new Cat(30,20));
        sc.add(new Cat(50,20));
        sc.add(new Cat(20,20));
        sc.add(new Cat(10,20));
        Collections.sort(sc,new CatComparator());
        for(int i=0;i<4;i++)
        {
        	Cat j = sc.get(i);
        	System.out.println(j.num);
        }
        File di = new File("D:/abc");
        if(!di.exists())
        {
        	di.mkdir();
        }
        File f = new File("D:/abc/a.txt");
        if(!f.exists())
        {
        	try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
        System.out.println(f.getName());
        Path p = f.toPath();
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:/abc/a.txt")))) {
			bw.write("1180200525");
			bw.newLine();
			bw.write("35");
		} catch (Exception e) {
			e.printStackTrace();
		}
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:/abc/a.txt")))) {
			String line;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:/abc/a.txt") )))
        {
        	dos.write(20);
        	dos.writeChars("\n");
        }catch (Exception e) {
			e.printStackTrace();
		}
        try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("D:/abc/a.txt") )))
        {
        	int m = dis.read();
        	int s = dis.read();
        	System.out.println(m);
        	System.out.println(s);
        	
        }catch (Exception e) {
			e.printStackTrace();
		}
        File code = new File("D:/abc/code.txt");
        File zip = new File("D:/abc/code2.zip");
        try 
        {
			InputStream input = new FileInputStream(code);
			ZipOutputStream output = new ZipOutputStream(new FileOutputStream(zip));
			output.putNextEntry(new ZipEntry(code.getName()));
			output.setComment("code1");
			int temp =0;
			while((temp = input.read())!=-1)
			{
				output.write(temp);
			}
			output.close();
			input.close();
		} 
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}
}
