import java.util.Scanner;
class maths
{
	int a,b,c,d,e,f,g,h,i,d1,d2,d3,de,de1,de2,de3;
	static
	{
		System.out.println("\t\t\t\t\tMATHS MATRIX PROBLEMS");
	}
	Scanner s=new Scanner(System.in);
	void inmatrix()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\t\t\t THIS PROGRAM IS FOR INVERSE OF MATRIX\n\n");
		System.out.println("enter the module numbers ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		e=s.nextInt();
		f=s.nextInt();
		g=s.nextInt();
		h=s.nextInt();
		i=s.nextInt();
		System.out.println("Enter D module numbers");
		int p1,p2,p3;
		p1=s.nextInt();
		p2=s.nextInt();
		p3=s.nextInt();
		System.out.println("\ndet=   |"+e+"   "+f+"|  |"+d+"   "+f+"|  |"+d+"   "+e+"|");
		System.out.println("      "+a+"|"+h+"   "+i+"|-"+b+"|"+g+"   "+i+"|+"+c+"|"+g+"   "+h+"|\n");
		System.out.println("det=  "+a+"["+(e*i)+" "+(f*h)+"]"+(-b)+"["+(d*i)+" "+(f*g)+"]"+(+c)+"["+(d*h)+" "+(e*g)+"]\n");
		System.out.println("det=  "+a+"("+((e*i)-(f*h))+")"+(-b)+"("+((d*i)-(f*g))+")"+(+c)+"("+((d*h)-(e*g))+")\n");
		System.out.println("det=  "+((a)*((e*i)-(f*h)))+" "+((-b)*((d*i)-(f*g)))+" "+((+c)*((d*h)-(e*g)))+"\n");
		int aa,bb,cc;
		aa=((a)*((e*i)-(f*h)));
		bb=((-b)*((d*i)-(f*g)));
		cc=((+c)*((d*h)-(e*g)));
		System.out.println(aa+bb+cc);
		if ((aa+bb+cc)!=0)
		{
			System.out.println("\t\t\t\t A inverse exist");
		
			System.out.println("               |  ("+(e*i)+"-"+(f*d)+")    -("+(d*i)+"-"+(f*g)+")     ("+(d*h)+"-"+(e*g)+") |");
			System.out.println("co-factor of A=| -("+(b*i)+"-"+(c*h)+")     ("+(a*i)+"-"+(c*g)+")    -("+(a*h)+"-"+(b*g)+") |");
			System.out.println("               |  ("+(b*f)+"-"+(c*e)+")    -("+(a*f)+"-"+(c*d)+")     ("+(a*e)+"-"+(b*d)+") |\n\n");
		
			System.out.println("               |  ("+((e*i)-(f*d))+")    -("+((d*i)-(f*g))+")     ("+((d*h)-(e*g))+") |");
			System.out.println("              =| -("+((b*i)-(c*h))+")     ("+((a*i)-(c*g))+")    -("+((a*h)-(b*g))+") |");
			System.out.println("               |  ("+((b*f)-(c*e))+")    -("+((a*f)-(c*d))+")     ("+((a*e)-(b*d))+") |\n\n");

			System.out.println("               |  "+((e*i)-(f*d))+"     "+(-((d*i)-(f*g)))+"     "+((d*h)-(e*g))+" |");
			System.out.println("              =|  "+(-((b*i)-(c*h)))+"     "+((a*i)-(c*g))+"     "+(-((a*h)-(b*g)))+" |");
			System.out.println("               |  "+((b*f)-(c*e))+"     "+(-((a*f)-(c*d)))+"     "+((a*e)-(b*d))+" |\n\n");
			int a1,b1,c1,d1,e1,f1,g1,h1,i1;
			a1=((e*i)-(f*d));
			b1=(-((d*i)-(f*g)));
			c1=((d*h)-(e*g));
			d1=(-((b*i)-(c*h)));
			e1=((a*i)-(c*g));
			f1=(-((a*h)-(b*g)));
			g1=((b*f)-(c*e));
			h1=(-((a*f)-(c*d)));
			i1=((a*e)-(b*d));
			System.out.println("                  |"+a1+"    "+b1+"    "+c1+"|T");
			System.out.println("(co-factor of A)T=|"+d1+"    "+e1+"    "+f1+"|");
			System.out.println("                  |"+g1+"    "+h1+"    "+i1+"|\n\n");	
		
			System.out.println("                  |"+a1+"    "+d1+"    "+g1+"|");
			System.out.println("                 =|"+b1+"    "+e1+"    "+h1+"|");
			System.out.println("                  |"+c1+"    "+f1+"    "+i1+"|\n\n");	

			System.out.println("\t\t\t\t INVERSE OF THE MATRIX\nA power -1=1/deta * ADJ A");
			System.out.println("           1/"+(aa+bb+cc)+"|"+a1+"    "+d1+"    "+g1+"|");
			System.out.println("          =    |"+b1+"    "+e1+"    "+h1+"|");
			System.out.println("               |"+c1+"    "+f1+"    "+i1+"|\n\n");
			int det=(aa+bb+cc);
			if (a1%det==0&&b1%det==0&&c1%det==0&&d1%det==0&&e1%det==0&&f1%det==0&&g1%det==0&&h1%det==0&&i1%det==0)
			{
				System.out.println("\t\t\tMATRIX INVERSION METHOD\nX=A (inverse)*D");
				
				System.out.println("              |"+(a1/det)+"    "+(d1/det)+"    "+(g1/det)+"|  |"+p1+"|");
				System.out.println("           X =|"+(b1/det)+"    "+(e1/det)+"    "+(h1/det)+"|  |"+p2+"|");
				System.out.println("              |"+(c1/det)+"    "+(f1/det)+"    "+(i1/det)+"|  |"+p3+"|\n\n");

				a1=(a1/det);
				b1=(d1/det);
				c1=(g1/det);
				d1=(b1/det);
				e1=(e1/det);
				f1=(h1/det);
				g1=(c1/det);
				h1=(f1/det);
				i1=(i1/det);

				System.out.println("              |"+(a1*p1)+"  +  "+(b1*p2)+"  +  "+(c1*p3)+"|");
				System.out.println("             =|"+(d1*p1)+"  +  "+(e1*p2)+"  +  "+(f1*p3)+"|");
				System.out.println("              |"+(g1*p3)+"  +  "+(h1*p2)+"  +  "+(i1*p3)+"|\n\n");

				System.out.println("              |"+((a1*p1)+(b1*p2)+(c1*p3))+"|");
				System.out.println("           X =|"+((d1*p1)+(e1*p2)+(f1*p3))+"|");
				System.out.println("              |"+((g1*p3)+(h1*p2)+(i1*p3))+"|\n\n");
			}
			else 
			{
				System.out.println("           1/"+(aa+bb+cc)+"|"+a1+"    "+d1+"    "+g1+"|   |"+p1+"|");
				System.out.println("        X =    |"+b1+"    "+e1+"    "+h1+"|   |"+p2+"|");
				System.out.println("               |"+c1+"    "+f1+"    "+i1+"|   |"+p3+"|\n\n");
				
				System.out.println("           1/"+(aa+bb+cc)+"|"+(a1*p1)+"    "+(d1*p2)+"    "+(g1*p3)+"|");
				System.out.println("          =    |"+(b1*p1)+"    "+(e1*p2)+"    "+(h1*p3)+"|");
				System.out.println("               |"+(c1*p1)+"    "+(f1*p2)+"    "+(i1*p3)+"|\n\n");

				System.out.println("           1/"+(aa+bb+cc)+"|"+((a1*p1)+(d1*p2)+(g1*p3))+"|");
				System.out.println("          =    |"+((b1*p1)+(e1*p2)+(h1*p3))+"|");
				System.out.println("               |"+((c1*p1)+(f1*p2)+(i1*p3))+"|\n\n");
				a1=((a1*p1)+(d1*p2)+(g1*p3));
				b1=((b1*p1)+(e1*p2)+(h1*p3));
				c1=((c1*p1)+(f1*p2)+(i1*p3));

				System.out.println("      |x|         |"+(a1/(aa+bb+cc))+"|");
				System.out.println("      |Y|    =    |"+(b1/(aa+bb+cc))+"|");
				System.out.println("      |Z|         |"+(c1/(aa+bb+cc))+"|\n\n");
			}

		}
		else
		{
			System.out.println("\t\t A inverse doesnot exist");
		}
	}
	void matrixin()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\t\t\t THIS PROGRAM IS FOR MATRIX INVERSION \n\n");
		System.out.println("enter the module numbers ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		e=s.nextInt();
		f=s.nextInt();
		g=s.nextInt();
		h=s.nextInt();
		i=s.nextInt();
		System.out.println("det=   |"+e+"   "+f+"|  |"+d+"   "+f+"|  |"+d+"   "+e+"|");
		System.out.println("      "+a+"|"+h+"   "+i+"|-"+b+"|"+g+"   "+i+"|+"+c+"|"+g+"   "+h+"|\n");
		System.out.println("det=  "+a+"["+(e*i)+" "+(f*h)+"]"+(-b)+"["+(d*i)+" "+(f*g)+"]"+(+c)+"["+(d*h)+" "+(e*g)+"]\n");
		System.out.println("det=  "+a+"("+((e*i)-(f*h))+")"+(-b)+"("+((d*i)-(f*g))+")"+(+c)+"("+((d*h)-(e*g))+")\n");
		System.out.println("det=  "+((a)*((e*i)-(f*h)))+" "+((-b)*((d*i)-(f*g)))+" "+((+c)*((d*h)-(e*g)))+"\n");
		int aa,bb,cc;
		aa=((a)*((e*i)-(f*h)));
		bb=((-b)*((d*i)-(f*g)));
		cc=((+c)*((d*h)-(e*g)));
		System.out.println(aa+bb+cc);
		if ((aa+bb+cc)!=0)
		{
			System.out.println("\t\t\t\t A inverse exist");
		
			System.out.println("               |  ("+(e*i)+"-"+(f*d)+")    -("+(d*i)+"-"+(f*g)+")     ("+(d*h)+"-"+(e*g)+") |");
			System.out.println("co-factor of A=| -("+(b*i)+"-"+(c*h)+")     ("+(a*i)+"-"+(c*g)+")    -("+(a*h)+"-"+(b*g)+") |");
			System.out.println("               |  ("+(b*f)+"-"+(c*e)+")    -("+(a*f)+"-"+(c*d)+")     ("+(a*e)+"-"+(b*d)+") |\n\n");
		
			System.out.println("               |  ("+((e*i)-(f*d))+")    -("+((d*i)-(f*g))+")     ("+((d*h)-(e*g))+") |");
			System.out.println("              =| -("+((b*i)-(c*h))+")     ("+((a*i)-(c*g))+")    -("+((a*h)-(b*g))+") |");
			System.out.println("               |  ("+((b*f)-(c*e))+")    -("+((a*f)-(c*d))+")     ("+((a*e)-(b*d))+") |\n\n");

			System.out.println("               |  "+((e*i)-(f*d))+"     "+(-((d*i)-(f*g)))+"     "+((d*h)-(e*g))+" |");
			System.out.println("              =|  "+(-((b*i)-(c*h)))+"     "+((a*i)-(c*g))+"     "+(-((a*h)-(b*g)))+" |");
			System.out.println("               |  "+((b*f)-(c*e))+"     "+(-((a*f)-(c*d)))+"     "+((a*e)-(b*d))+" |\n\n");
			int a1,b1,c1,d1,e1,f1,g1,h1,i1;
			a1=((e*i)-(f*d));
			b1=(-((d*i)-(f*g)));
			c1=((d*h)-(e*g));
			d1=(-((b*i)-(c*h)));
			e1=((a*i)-(c*g));
			f1=(-((a*h)-(b*g)));
			g1=((b*f)-(c*e));
			h1=(-((a*f)-(c*d)));
			i1=((a*e)-(b*d));
			System.out.println("                  |"+a1+"    "+b1+"    "+c1+"|T");
			System.out.println("(co-factor of A)T=|"+d1+"    "+e1+"    "+f1+"|");
			System.out.println("                  |"+g1+"    "+h1+"    "+i1+"|\n\n");	
		
			System.out.println("                  |"+a1+"    "+d1+"    "+g1+"|");
			System.out.println("                 =|"+b1+"    "+e1+"    "+h1+"|");
			System.out.println("                  |"+c1+"    "+f1+"    "+i1+"|\n\n");	

			System.out.println("\t\t INVERSE OF THE MATRIX\nA power -1=1/deta * ADJ A");
			System.out.println("           1/"+(aa+bb+cc)+"|"+a1+"    "+d1+"    "+g1+"|");
			System.out.println("          =    |"+b1+"    "+e1+"    "+h1+"|");
			System.out.println("               |"+c1+"    "+f1+"    "+i1+"|\n\n");
			int det=(aa+bb+cc);
			if (a1%det==0&&b1%det==0&&c1%det==0&&d1%det==0&&e1%det==0&&f1%det==0&&g1%det==0&&h1%det==0&&i1%det==0)
			{
				System.out.println("              |"+(a1/det)+"    "+(d1/det)+"    "+(g1/det)+"|");
				System.out.println("             =|"+(b1/det)+"    "+(e1/det)+"    "+(h1/det)+"|");
				System.out.println("              |"+(c1/det)+"    "+(f1/det)+"    "+(i1/det)+"|");
			}
			else 
			{
				System.out.println("           1/"+(aa+bb+cc)+"|"+a1+"    "+d1+"    "+g1+"|");
				System.out.println("          =    |"+b1+"    "+e1+"    "+h1+"|");
				System.out.println("               |"+c1+"    "+f1+"    "+i1+"|\n\n");
			}

		}
		else
		{
			System.out.println("\t\t A inverse doesnot exist");
		}
	}
	void cra() 
	{

		System.out.println("\t\t\t THIS PROGRAM IS CRAMERS RULE\n\n");
		System.out.println("enter A module numbers ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		e=s.nextInt();
		f=s.nextInt();
		g=s.nextInt();
		h=s.nextInt();
		i=s.nextInt();
		System.out.println("enter D module numbers");
		d1=s.nextInt();
		d2=s.nextInt();
		d3=s.nextInt();
		/*det*/
		System.out.println("      |"+e+"   "+f+"|  |"+d+"   "+f+"|  |"+d+"   "+e+"|");
		System.out.println("det=  "+a+"|"+h+"   "+i+"|-"+b+"|"+g+"   "+i+"|+"+c+"|"+g+"   "+h+"|\n");
		System.out.println("det=  "+a+"["+(e*i)+" "+(f*h)+"]"+(-b)+"["+(d*i)+" "+(f*g)+"]"+(+c)+"["+(d*h)+" "+(e*g)+"]\n");
		System.out.println("det=  "+a+"("+((e*i)-(f*h))+")"+(-b)+"("+((d*i)-(f*g))+")"+(+c)+"("+((d*h)-(e*g))+")\n");
		System.out.println("det=  "+((a)*((e*i)-(f*h)))+" "+((-b)*((d*i)-(f*g)))+" "+((+c)*((d*h)-(e*g)))+"\n");
		int a1,a2,a3;
		a1=((a)*((e*i)-(f*h)));
		a2=((-b)*((d*i)-(f*g)));
		a3=((+c)*((d*h)-(e*g)));
		de=(a1+a2+a3);
		System.out.println("det="+(a1+a2+a3)+"\n\n");
		/*det1*/
		System.out.println("       |"+e+"   "+f+"|  |"+d2+"   "+f+"|  |"+d2+"   "+e+"|");
		System.out.println("det1=  "+d1+"|"+h+"   "+i+"|-"+b+"|"+d3+"   "+i+"|+"+c+"|"+d3+"   "+h+"|\n");
		System.out.println("det1=  "+d1+"["+(e*i)+" "+(f*h)+"]"+(-b)+"["+(d2*i)+" "+(f*d3)+"]"+(+c)+"["+(d2*h)+" "+(e*d3)+"]\n");
		System.out.println("det1=  "+d1+"("+((e*i)-(f*h))+")"+(-b)+"("+((d2*i)-(f*d3))+")"+(+c)+"("+((d2*h)-(e*d3))+")\n");
		System.out.println("det1=  "+((d1)*((e*i)-(f*h)))+" "+((-b)*((d2*i)-(f*d3)))+" "+((+c)*((d2*h)-(e*d3)))+"\n");
		int b1,b2,b3;
		b1=((d1)*((e*i)-(f*h)));
		b2=((-b)*((d2*i)-(f*d3)));
		b3=((+c)*((d2*h)-(e*d3)));
		de1=(b1+b2+b3);
		System.out.println("det1="+(b1+b2+b3)+"\n\n");
		/*det2*/
		System.out.println("       |"+d2+"   "+f+"|  |"+d+"   "+f+"|  |"+d+"   "+d2+"|");
		System.out.println("det2=  "+a+"|"+d3+"   "+i+"|-"+d1+"|"+g+"   "+i+"|+"+c+"|"+g+"   "+d3+"|\n");
		System.out.println("det2=  "+a+"["+(d2*i)+" "+(f*d3)+"]"+(-d1)+"["+(d*i)+" "+(f*g)+"]"+(+c)+"["+(d*d3)+" "+(d2*g)+"]\n");
		System.out.println("det2=  "+a+"("+((d2*i)-(f*d3))+")"+(-d1)+"("+((d*i)-(f*g))+")"+(+c)+"("+((d*d3)-(d2*g))+")\n");
		System.out.println("det2=  "+((a)*((d2*i)-(f*d3)))+" "+((-d1)*((d*i)-(f*g)))+" "+((+c)*((d*d3)-(d2*g)))+"\n");
		int c1,c2,c3;
		c1=((a)*((d2*i)-(f*d3)));
		c2=((-d1)*((d*i)-(f*g)));
		c3=((+c)*((d*d3)-(d2*g)));
		de2=(c1+c2+c3);
		System.out.println("det2="+(c1+c2+c3)+"\n\n");
		/*det3*/
		System.out.println("       |"+e+"   "+d2+"|  |"+d+"   "+d2+"|  |"+d+"   "+e+"|");
		System.out.println("det3=  "+a+"|"+h+"   "+d3+"|-"+b+"|"+g+"   "+d3+"|+"+d1+"|"+g+"   "+h+"|\n");
		System.out.println("det3=  "+a+"["+(e*d3)+" "+(d2*h)+"]"+(-b)+"["+(d*d3)+" "+(d2*g)+"]"+(+d1)+"["+(d*h)+" "+(e*g)+"]\n");
		System.out.println("det3=  "+a+"("+((e*d3)-(d2*h))+")"+(-b)+"("+((d*d3)-(d2*g))+")"+(+d1)+"("+((d*h)-(e*g))+")\n");
		System.out.println("det3=  "+((a)*((e*d3)-(d2*h)))+" "+((-b)*((d*d3)-(d2*g)))+" "+((+d1)*((d*h)-(e*g)))+"\n");
		int x1,x2,x3;
		x1=((a)*((e*d3)-(d2*h)));
		x2=((-b)*((d*d3)-(d2*g)));
		x3=((+d1)*((d*h)-(e*g)));
		de3=(x1+x2+x3);
		System.out.println("det3="+(x1+x2+x3)+"\n\n");
		System.out.println("\tBY USING CRAMERS RULE\n");
		System.out.println("  "+de1+"     "+de2+"     "+de3+"");
		System.out.println("x=----   y=----   z=----");
		System.out.println("  "+de+"        "+de+"      "+de+"\n");
		System.out.println("x="+(de1/de)+";   y="+(de2/de)+";   z="+(de3/de));

	}
	void loplace()
	{
		
		System.out.println("\t\t\t THIS PROGRAM IS LOPLACE EXPANSSION\n\n");
		System.out.println("enter the module numbers ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		e=s.nextInt();
		f=s.nextInt();
		g=s.nextInt();
		h=s.nextInt();
		i=s.nextInt();
		System.out.println(" |"+e+"   "+f+"|  |"+d+"   "+f+"|  |"+d+"   "+e+"|");
		System.out.println(+a+"|"+h+"   "+i+"|-"+b+"|"+g+"   "+i+"|+"+c+"|"+g+"   "+h+"|\n");
		System.out.println(+a+"["+(e*i)+" "+(f*h)+"]"+(-b)+"["+(d*i)+" "+(f*g)+"]"+(+c)+"["+(d*h)+" "+(e*g)+"]\n");
		System.out.println(+a+"("+((e*i)-(f*h))+")"+(-b)+"("+((d*i)-(f*g))+")"+(+c)+"("+((d*h)-(e*g))+")\n");
		System.out.println(((a)*((e*i)-(f*h)))+" "+((-b)*((d*i)-(f*g)))+" "+((+c)*((d*h)-(e*g)))+"\n");
		a=((a)*((e*i)-(f*h)));
		b=((-b)*((d*i)-(f*g)));
		c=((+c)*((d*h)-(e*g)));
		System.out.println(a+b+c);
	}
	void addition()
	{
		
		System.out.println("\t\t\t\tTHIS IS 2X2 MATRIX PROGRAM\n\n");

		System.out.println("enter first matrixs numbers");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		System.out.println("enter second matrix numbers");
		e=s.nextInt();
		f=s.nextInt();
		g=s.nextInt();
		h=s.nextInt();
		System.out.println("\n\n["+a+"     "+b+"|     ["+e+"     "+f+"|\n|"+c+"     "+d+"]   +  |"+g+"     "+h+"]");
		System.out.println("\n\n["+a+"+"+e+"     "+b+"+"+f+"|\n|"+c+"+"+g+"     "+d+"+"+h+"]");
		System.out.println("\n\n["+(a+e)+"     "+(b+f)+"|\n|"+(c+g)+"     "+(d+h)+"]");
	}
	void multi()
	{
		System.out.println("\t\t\t\tTHIS IS 2X2 MATRIX PROGRAM\n\n");
		System.out.println("enter first matrixs numbers");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		System.out.println("enter second matrix numbers");
		e=s.nextInt();
		f=s.nextInt();
		g=s.nextInt();
		h=s.nextInt();
		System.out.println("\n\n["+a+"     "+b+"|     ["+e+"     "+f+"|\n|"+c+"     "+d+"]   .  |"+g+"     "+h+"]");
		System.out.println("\n\n["+a+"x"+e+"+"+b+"x"+g+"     "+a+"x"+f+"+"+b+"x"+h+"|\n|"+c+"x"+e+"+"+d+"x"+g+"     "+c+"x"+f+"+"+d+"x"+h+"]");
		System.out.println("\n\n["+((a*e)+(b*g))+"     "+((a*f)+(b*h))+"|\n|"+((c*e)+(d*g))+"     "+((c*f)+(d*h))+"]");
	}
	void main()
	{
		int x;
		
		System.out.println("\n1.ADDITION OF 2X2 MATRIX");
		System.out.println("2.MULTIPLY OF 2X2 MATRIX");
		System.out.println("3.LOPLACE EXPANSSION");
		System.out.println("4.CRAMERS RULE");
		System.out.println("5.INVERSE OF MATRIX");
		System.out.println("6.MATRIX INVERSION");
		System.out.println("0.EXIT");
		System.out.print("\nENTER THE NUMBER:-");
		x=s.nextInt();
		while (x>=7 || x<=-1)
		{
			System.out.print("INCORRECT NUMBER ENTER A VAILD NUMBER:-");
			x=s.nextInt();
		}
		
		
		if (x==3)
		{
			maths c=new maths();
			c.loplace();
			
		}
		else if (x==6)
		{
			maths c=new maths();
			c.inmatrix();
		}
		else if (x==5)
		{
			maths c=new maths();
			c.inmatrix();
		}
 		else if (x==4)
		{
			maths c=new maths();
			c.cra();
		}
		else if (x==2)
		{
			maths c=new maths();
			c.multi();
		}
		else if (x==1)
		{
			maths c=new maths();
			c.addition();
		}
		else if(x==0)
		{
			
		}
		else 
		{
				System.out.print("INCORRECT NUMBER ENTER A VALID NUMBER:- ");
				x=s.nextInt();
		}
	}
	
	public static void main(String[]args) 
	{
		int x=1;
		Scanner s=new Scanner(System.in);
		maths c=new maths();
		c.main();
		while (x!=0)
		{
			System.out.print("DO YOU WANT EXIT (0 TO EXIT):-");
			x=s.nextInt();
			if (x!=0)
			{
				c.main();
			}
			else
			{
				System.out.println("\t\t\t\tTHANKS FOR USING MY SOFTWARE\n");
				x=0;
			}
		}
	}
}
