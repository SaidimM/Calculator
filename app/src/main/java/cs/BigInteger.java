
package cs;

import java.util.*;

import static java.lang.Integer.parseInt;

public class BigInteger implements BigInt {
	Sign sign;
	private String number;
	private boolean isNegative;
	public BigInteger(String integer) {
		// TODO Auto-generated constructor stub
		number = integer;
		char []cList=number.toCharArray();
		for(int i=0;i<cList.length;i++){
			if(cList[i]>57&&cList[i]<48&&cList[i]!=43&&cList[i]!=45){
				System.out.println("请输入数字！");
				System.exit(0);
			}
		}
		if(cList[0]=='-'){
		    sign=Sign.NEGATIVE;
        }
		else{
		    sign=Sign.POSITIVE;
        }
	}

	public BigInteger(Long integer) {
		// TODO Auto-generated constructor stub
		String s=Long.toString(integer);
		char []cList=s.toCharArray();
		for(int i=0;i<cList.length;i++){
			if(cList[i]>57&&cList[i]<48&&cList[i]!=43&&cList[i]!=45){
				System.out.println("请输入数字！");
				System.exit(0);
			}
		}
        if(cList[0]=='-'){
            sign=Sign.NEGATIVE;
        }
        else{
            sign=Sign.POSITIVE;
        }
	}


	public BigInteger add(BigInteger bInt) {
		// TODO Auto-generated method stub
        Deque<String> d1=new ArrayDeque<>();
        String S1=bInt.toString();
        String []a=S1.split("");
        if(a[0].equals("-")||a[0].equals("+")){
            for(int i=1;i<S1.length();i++){
                d1.add(a[i]);
            }
            S1=S1.substring(1);
            a=S1.split("");
        }else{
            for(int i=0;i<S1.length();i++){
                d1.add(a[i]);
            }
        }
        Deque<String> d2=new ArrayDeque<>();
        String S2=this.toString();
        String []b=S2.split("");
        if(b[0].equals("-")||b[0].equals("+")){
            for(int i=1;i<S2.length();i++){
                d2.add(b[i]);
            }
            S2=S2.substring(1);
            b=S2.split("");
        }else{
            for(int i=0;i<S2.length();i++){
                d2.add(b[i]);
            }
        }
		Deque<String> Result=new ArrayDeque<>();
		if(this.sign==Sign.NEGATIVE&&bInt.sign==Sign.NEGATIVE){
			int l;
			if(S1.length()>S2.length())
				l=S1.length();
			else
				l=S2.length();
			int tDigit=0;
			int temp,Digit;
			int n1,n2;
			for(int i=0;i<l;i++){
				if(d1.peekLast()!=null||d2.peekLast()!=null){
					if(d1.peekLast()!=null&&d2.peekLast()!=null){
						n1=parseInt(d1.pollLast());
						n2=parseInt(d2.pollLast());
						temp=n1 +n2 +tDigit;
						tDigit=temp/10;
						Digit=temp%10;
						Result.addFirst(String.valueOf(Digit));
					}
					else if(d1.peekLast()==null){
						temp= parseInt(d2.pollLast())+tDigit;
						tDigit=temp/10;
						Digit=temp%10;
						Result.addFirst(String.valueOf(Digit));
					}
					else {
						temp=parseInt(d1.pollLast())+tDigit;
						tDigit=temp/10;
						Digit=temp%10;
						Result.addFirst(String.valueOf(Digit));
					}
				}
			}
			if(tDigit!=0){
				Result.addFirst(Integer.toString(tDigit));
			}
			isNegative=true;
		}
		else if(this.sign==Sign.POSITIVE&&bInt.sign==Sign.POSITIVE){
			int l;
			if(S1.length()>S2.length())
				l=S1.length();
			else
				l=S2.length();
			int tDigit=0;
			int temp,Digit;
			int n1,n2;
			for(int i=0;i<l;i++){
				if(d1.peekLast()!=null||d2.peekLast()!=null){
					if(d1.peekLast()!=null&&d2.peekLast()!=null){
						n1=parseInt(d1.pollLast());
						n2=parseInt(d2.pollLast());
						temp=n1 +n2 +tDigit;
						tDigit=temp/10;
						Digit=temp%10;
						Result.addFirst(String.valueOf(Digit));
					}
					else if(d1.peekLast()==null){
						temp= parseInt(d2.pollLast())+tDigit;
						tDigit=temp/10;
						Digit=temp%10;
						Result.addFirst(String.valueOf(Digit));
					}
					else {
						temp=parseInt(d1.pollLast())+tDigit;
						tDigit=temp/10;
						Digit=temp%10;
						Result.addFirst(String.valueOf(Digit));
					}
				}
			}
			if(tDigit!=0){
				Result.addFirst(Integer.toString(tDigit));
			}
			isNegative=false;
		}
		else if(this.sign==Sign.NEGATIVE&&bInt.sign==Sign.POSITIVE){
            int l;
            if(S1.length()>S2.length())
                l=S1.length();
            else
                l=S2.length();
            int temp=0;
            int Digit;
            int n1,n2;
            if(S2.length()>S1.length()){
                for(int i=0;i<l;i++){
                    if(d1.peekLast()!=null||d2.peekLast()!=null){
                        if(d1.peekLast()!=null&&d2.peekLast()!=null){
                            n1=parseInt(d1.pollLast());
                            n2=parseInt(d2.pollLast());
                            if(temp==-1){
                                if(n2<n1+1){
                                    Digit=n2+10-n1+temp;
                                    temp=-1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2-n1+temp;
                                    Result.addFirst(String.valueOf(Digit));
                                    temp=0;
                                }
                            }
                            else{
                                if(n2<n1){
                                    Digit=n2+10-n1;
                                    temp=-1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2-n1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                            }
                        }
                        else if(d1.peekLast()==null){
                            n2=parseInt(d2.pollLast());
                            if(temp==-1){
                                if(n2==0){
                                    Digit=9;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2+temp;
                                    temp=0;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                            }
                            else{
                                Digit=n2;
                                Result.addFirst(String.valueOf(Digit));
                            }
                        }
                    }
                }
                isNegative=true;
            }
            else if(S1.length()==S2.length()){
                int B=0;
                for(int i=0;i<l;i++){
                    if(parseInt(a[i])>parseInt(b[i])){
                        B=-1;
                        break;
                    }
                    else if(parseInt(a[i])<parseInt(b[i])){
                        B=1;
                        break;
                    }
                }
                if(B==1){
                    for(int i=0;i<l;i++){
                        n1=parseInt(d1.pollLast());
                        n2=parseInt(d2.pollLast());
                        if (temp == -1) {
                            if (n2 < n1 + 1) {
                                Digit = n2 + 10 - n1 + temp;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1 + temp;
                                Result.addFirst(String.valueOf(Digit));
                                temp = 0;
                            }
                        } else {
                            if (n2 < n1) {
                                Digit = n2 + 10 - n1;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1;
                                Result.addFirst(String.valueOf(Digit));
                            }
                        }
                    }
                    isNegative=true;
                }
                else if(B==-1){
                    for(int i=0;i<l;i++){
                        n2=parseInt(d1.pollLast());
                        n1=parseInt(d2.pollLast());
                        if (temp == -1) {
                            if (n2 < n1 + 1) {
                                Digit = n2 + 10 - n1 + temp;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1 + temp;
                                Result.addFirst(String.valueOf(Digit));
                                temp = 0;
                            }
                        } else {
                            if (n2 < n1) {
                                Digit = n2 + 10 - n1;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1;
                                Result.addFirst(String.valueOf(Digit));
                            }
                        }
                    }
                    isNegative=false;
                }
                else
                    Result.add("0");
            }
            else {
                for(int i=0;i<l;i++){
                    if(d1.peekLast()!=null||d2.peekLast()!=null){
                        if(d1.peekLast()!=null&&d2.peekLast()!=null){
                            n2=parseInt(d1.pollLast());
                            n1=parseInt(d2.pollLast());
                            if(temp==-1){
                                if(n2<n1+1){
                                    Digit=n2+10-n1+temp;
                                    temp=-1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2-n1+temp;
                                    Result.addFirst(String.valueOf(Digit));
                                    temp=0;
                                }
                            }
                            else{
                                if(n2<n1){
                                    Digit=n2+10-n1;
                                    temp=-1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2-n1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                            }
                        }
                        else if(d1.peekLast()==null){
                            n2=parseInt(d1.pollLast());
                            if(temp==-1){
                                if(n2==0){
                                    Digit=9;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2+temp;
                                    temp=0;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                            }
                            else{
                                Digit=n2;
                                Result.addFirst(String.valueOf(Digit));
                            }
                        }
                    }
                }
                isNegative=false;
            }
		}
		else{
            int l;
            if(S1.length()>S2.length())
                l=S1.length();
            else
                l=S2.length();
            int temp=0;
            int Digit;
            int n1,n2;
            if(S2.length()>S1.length()){
                for(int i=0;i<l;i++){
                    if(d1.peekLast()!=null||d2.peekLast()!=null){
                        if(d1.peekLast()!=null&&d2.peekLast()!=null){
                            n1=parseInt(d1.pollLast());
                            n2=parseInt(d2.pollLast());
                            if(temp==-1){
                                if(n2<n1+1){
                                    Digit=n2+10-n1+temp;
                                    temp=-1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2-n1+temp;
                                    Result.addFirst(String.valueOf(Digit));
                                    temp=0;
                                }
                            }
                            else{
                                if(n2<n1){
                                    Digit=n2+10-n1;
                                    temp=-1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2-n1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                            }
                        }
                        else if(d1.peekLast()==null){
                            n2=parseInt(d2.pollLast());
                            if(temp==-1){
                                if(n2==0){
                                    Digit=9;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2+temp;
                                    temp=0;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                            }
                            else{
                                Digit=n2;
                                Result.addFirst(String.valueOf(Digit));
                            }
                        }
                    }
                }
                isNegative=false;
            }
            else if(S1.length()==S2.length()){
                int B=0;
                for(int i=0;i<l;i++){
                    if(parseInt(a[i])>parseInt(b[i])){
                        B=-1;
                        break;
                    }
                    else if(parseInt(a[i])<parseInt(b[i])){
                        B=1;
                        break;
                    }
                }
                if(B==1){
                    for(int i=0;i<l;i++){
                        n1=parseInt(d1.pollLast());
                        n2=parseInt(d2.pollLast());
                        if (temp == -1) {
                            if (n2 < n1 + 1) {
                                Digit = n2 + 10 - n1 + temp;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1 + temp;
                                Result.addFirst(String.valueOf(Digit));
                                temp = 0;
                            }
                        } else {
                            if (n2 < n1) {
                                Digit = n2 + 10 - n1;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1;
                                Result.addFirst(String.valueOf(Digit));
                            }
                        }
                    }
                    isNegative=false;
                }
                else if(B==-1){
                    for(int i=0;i<l;i++){
                        n2=parseInt(d1.pollLast());
                        n1=parseInt(d2.pollLast());
                        if (temp == -1) {
                            if (n2 < n1 + 1) {
                                Digit = n2 + 10 - n1 + temp;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1 + temp;
                                Result.addFirst(String.valueOf(Digit));
                                temp = 0;
                            }
                        } else {
                            if (n2 < n1) {
                                Digit = n2 + 10 - n1;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1;
                                Result.addFirst(String.valueOf(Digit));
                            }
                        }
                    }
                    isNegative=true;
                }
                else
                    Result.add("0");
            }
            else {
                for(int i=0;i<l;i++){
                    if(d1.peekLast()!=null||d2.peekLast()!=null){
                        if(d1.peekLast()!=null&&d2.peekLast()!=null){
                            n2=parseInt(d1.pollLast());
                            n1=parseInt(d2.pollLast());
                            if(temp==-1){
                                if(n2<n1+1){
                                    Digit=n2+10-n1+temp;
                                    temp=-1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2-n1+temp;
                                    Result.addFirst(String.valueOf(Digit));
                                    temp=0;
                                }
                            }
                            else{
                                if(n2<n1){
                                    Digit=n2+10-n1;
                                    temp=-1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2-n1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                            }
                        }
                        else if(d1.peekLast()==null){
                            n2=parseInt(d1.pollLast());
                            if(temp==-1){
                                if(n2==0){
                                    Digit=9;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2+temp;
                                    temp=0;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                            }
                            else{
                                Digit=n2;
                                Result.addFirst(String.valueOf(Digit));
                            }
                        }
                    }
                }
                isNegative=true;
            }
		}
        while(Result.peekFirst().equals("0")){
            Result.pollFirst();
        }
		if(isNegative==true){
			Result.addFirst("-");
		}
        String r="";
        while(Result.peekFirst()!=null){
            r=r.concat(Result.pollFirst());
        }
        return new BigInteger(r);
	}

	public BigInteger sub(BigInteger bInt) {
		// TODO Auto-generated method stub
        Deque<String> d1=new ArrayDeque<>();
        String S1=bInt.toString();
        String []a=S1.split("");
        if(a[0].equals("-")||a[0].equals("+")){
            for(int i=1;i<S1.length();i++){
                d1.add(a[i]);
            }
            S1=S1.substring(1);
            a=S1.split("");
        }else{
            for(int i=0;i<S1.length();i++){
                d1.add(a[i]);
            }
        }
        Deque<String> d2=new ArrayDeque<>();
        String S2=this.toString();
        String []b=S2.split("");
        if(b[0].equals("-")||b[0].equals("+")){
            for(int i=1;i<S2.length();i++){
                d2.add(b[i]);
            }
            S2=S2.substring(1);
            b=S2.split("");
        }else{
            for(int i=0;i<S2.length();i++){
                d2.add(b[i]);
            }
        }
		Deque<String> Result=new ArrayDeque<>();
		if(this.sign==Sign.NEGATIVE&&bInt.getSign()==Sign.NEGATIVE){
            int l;
            if(S1.length()>S2.length())
                l=S1.length();
            else
                l=S2.length();
            int temp=0;
            int Digit;
            int n1,n2;
            if(S2.length()>S1.length()){
                for(int i=0;i<l;i++){
                    if(d1.peekLast()!=null||d2.peekLast()!=null){
                        if(d1.peekLast()!=null&&d2.peekLast()!=null){
                            n1=parseInt(d1.pollLast());
                            n2=parseInt(d2.pollLast());
                            if(temp==-1){
                                if(n2<n1+1){
                                    Digit=n2+10-n1+temp;
                                    temp=-1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2-n1+temp;
                                    Result.addFirst(String.valueOf(Digit));
                                    temp=0;
                                }
                            }
                            else{
                                if(n2<n1){
                                    Digit=n2+10-n1;
                                    temp=-1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2-n1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                            }
                        }
                        else if(d1.peekLast()==null){
                            n2=parseInt(d2.pollLast());
                            if(temp==-1){
                                if(n2==0){
                                    Digit=9;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2+temp;
                                    temp=0;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                            }
                            else{
                                Digit=n2;
                                Result.addFirst(String.valueOf(Digit));
                            }
                        }
                    }
                }
                isNegative=true;
            }
            else if(S1.length()==S2.length()){
                int B=0;
                for(int i=0;i<l;i++){
                    if(parseInt(a[i])>parseInt(b[i])){
                        B=-1;
                        break;
                    }
                    else if(parseInt(a[i])<parseInt(b[i])){
                        B=1;
                        break;
                    }
                }
                if(B==1){
                    for(int i=0;i<l;i++){
                        n1=parseInt(d1.pollLast());
                        n2=parseInt(d2.pollLast());
                        if (temp == -1) {
                            if (n2 < n1 + 1) {
                                Digit = n2 + 10 - n1 + temp;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1 + temp;
                                Result.addFirst(String.valueOf(Digit));
                                temp = 0;
                            }
                        } else {
                            if (n2 < n1) {
                                Digit = n2 + 10 - n1;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1;
                                Result.addFirst(String.valueOf(Digit));
                            }
                        }
                    }
                    isNegative=true;
                }
                else if(B==-1){
                    for(int i=0;i<l;i++){
                        n2=parseInt(d1.pollLast());
                        n1=parseInt(d2.pollLast());
                        if (temp == -1) {
                            if (n2 < n1 + 1) {
                                Digit = n2 + 10 - n1 + temp;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1 + temp;
                                Result.addFirst(String.valueOf(Digit));
                                temp = 0;
                            }
                        } else {
                            if (n2 < n1) {
                                Digit = n2 + 10 - n1;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1;
                                Result.addFirst(String.valueOf(Digit));
                            }
                        }
                    }
                    isNegative=false;
                }
                else
                    Result.add("0");
            }
            else {
                for(int i=0;i<l;i++){
                    if(d1.peekLast()!=null||d2.peekLast()!=null){
                        if(d1.peekLast()!=null&&d2.peekLast()!=null){
                            n2=parseInt(d1.pollLast());
                            n1=parseInt(d2.pollLast());
                            if(temp==-1){
                                if(n2<n1+1){
                                    Digit=n2+10-n1+temp;
                                    temp=-1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2-n1+temp;
                                    Result.addFirst(String.valueOf(Digit));
                                    temp=0;
                                }
                            }
                            else{
                                if(n2<n1){
                                    Digit=n2+10-n1;
                                    temp=-1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2-n1;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                            }
                        }
                        else if(d1.peekLast()==null){
                            n2=parseInt(d1.pollLast());
                            if(temp==-1){
                                if(n2==0){
                                    Digit=9;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                                else{
                                    Digit=n2+temp;
                                    temp=0;
                                    Result.addFirst(String.valueOf(Digit));
                                }
                            }
                            else{
                                Digit=n2;
                                Result.addFirst(String.valueOf(Digit));
                            }
                        }
                    }
                }
                isNegative=false;
            }
		}
		else if(this.sign==Sign.POSITIVE&&bInt.getSign()==Sign.POSITIVE){
			int l;
			if(S1.length()>S2.length())
				l=S1.length();
			else
				l=S2.length();
			int temp=0;
			int Digit;
			int n1,n2;
			if(S2.length()>S1.length()){
				for(int i=0;i<l;i++){
					if(d1.peekLast()!=null||d2.peekLast()!=null){
						if(d1.peekLast()!=null&&d2.peekLast()!=null){
							n1=parseInt(d1.pollLast());
							n2=parseInt(d2.pollLast());
							if(temp==-1){
								if(n2<n1+1){
									Digit=n2+10-n1+temp;
									temp=-1;
									Result.addFirst(String.valueOf(Digit));
								}
								else{
									Digit=n2-n1+temp;
									Result.addFirst(String.valueOf(Digit));
									temp=0;
								}
							}
							else{
								if(n2<n1){
									Digit=n2+10-n1;
									temp=-1;
									Result.addFirst(String.valueOf(Digit));
								}
								else{
									Digit=n2-n1;
									Result.addFirst(String.valueOf(Digit));
								}
							}
						}
						else if(d1.peekLast()==null){
							n2=parseInt(d2.pollLast());
							if(temp==-1){
								if(n2==0){
									Digit=9;
									Result.addFirst(String.valueOf(Digit));
								}
								else{
									Digit=n2+temp;
									temp=0;
									Result.addFirst(String.valueOf(Digit));
								}
							}
							else{
								Digit=n2;
								Result.addFirst(String.valueOf(Digit));
							}
						}
					}
				}
				isNegative=false;
			}
			else if(S1.length()==S2.length()){
			    int B=0;
			    for(int i=0;i<l;i++){
			        if(parseInt(a[i])>parseInt(b[i])){
			            B=-1;
			            break;
                    }
			        else if(parseInt(a[i])<parseInt(b[i])){
			            B=1;
			            break;
                    }
                }
			    if(B==1){
                    for(int i=0;i<l;i++){
                        n1=parseInt(d1.pollLast());
                        n2=parseInt(d2.pollLast());
                        if (temp == -1) {
                            if (n2 < n1 + 1) {
                                Digit = n2 + 10 - n1 + temp;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1 + temp;
                                Result.addFirst(String.valueOf(Digit));
                                temp = 0;
                            }
                        } else {
                            if (n2 < n1) {
                                Digit = n2 + 10 - n1;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1;
                                Result.addFirst(String.valueOf(Digit));
                            }
                        }
                    }
                    isNegative=false;
                }
			    else if(B==-1){
                    for(int i=0;i<l;i++){
                        n2=parseInt(d1.pollLast());
                        n1=parseInt(d2.pollLast());
                        if (temp == -1) {
                            if (n2 < n1 + 1) {
                                Digit = n2 + 10 - n1 + temp;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1 + temp;
                                Result.addFirst(String.valueOf(Digit));
                                temp = 0;
                            }
                        } else {
                            if (n2 < n1) {
                                Digit = n2 + 10 - n1;
                                temp = -1;
                                Result.addFirst(String.valueOf(Digit));
                            } else {
                                Digit = n2 - n1;
                                Result.addFirst(String.valueOf(Digit));
                            }
                        }
                    }
                    isNegative=true;
                }
			    else
			        Result.add("0");
			}
			else {
				for(int i=0;i<l;i++){
					if(d1.peekLast()!=null||d2.peekLast()!=null){
						if(d1.peekLast()!=null&&d2.peekLast()!=null){
							n2=parseInt(d1.pollLast());
							n1=parseInt(d2.pollLast());
							if(temp==-1){
								if(n2<n1+1){
									Digit=n2+10-n1+temp;
									temp=-1;
									Result.addFirst(String.valueOf(Digit));
								}
								else{
									Digit=n2-n1+temp;
									Result.addFirst(String.valueOf(Digit));
									temp=0;
								}
							}
							else{
								if(n2<n1){
									Digit=n2+10-n1;
									temp=-1;
									Result.addFirst(String.valueOf(Digit));
								}
								else{
									Digit=n2-n1;
									Result.addFirst(String.valueOf(Digit));
								}
							}
						}
						else if(d1.peekLast()==null){
							n2=parseInt(d1.pollLast());
							if(temp==-1){
								if(n2==0){
									Digit=9;
									Result.addFirst(String.valueOf(Digit));
								}
								else{
									Digit=n2+temp;
									temp=0;
									Result.addFirst(String.valueOf(Digit));
								}
							}
							else{
								Digit=n2;
								Result.addFirst(String.valueOf(Digit));
							}
						}
					}
				}
				isNegative=true;
			}
		}
		else if(this.sign==Sign.NEGATIVE&&bInt.getSign()==Sign.POSITIVE){
            int l;
            if(S1.length()>S2.length())
                l=S1.length();
            else
                l=S2.length();
            int tDigit=0;
            int temp,Digit;
            int n1,n2;
            for(int i=0;i<l;i++){
                if(d1.peekLast()!=null||d2.peekLast()!=null){
                    if(d1.peekLast()!=null&&d2.peekLast()!=null){
                        n1=parseInt(d1.pollLast());
                        n2=parseInt(d2.pollLast());
                        temp=n1 +n2 +tDigit;
                        tDigit=temp/10;
                        Digit=temp%10;
                        Result.addFirst(String.valueOf(Digit));
                    }
                    else if(d1.peekLast()==null){
                        temp= parseInt(d2.pollLast())+tDigit;
                        tDigit=temp/10;
                        Digit=temp%10;
                        Result.addFirst(String.valueOf(Digit));
                    }
                    else {
                        temp=parseInt(d1.pollLast())+tDigit;
                        tDigit=temp/10;
                        Digit=temp%10;
                        Result.addFirst(String.valueOf(Digit));
                    }
                }
            }
            if(tDigit!=0){
                Result.addFirst(Integer.toString(tDigit));
            }
			isNegative=true;
		}
		else if(this.sign==Sign.POSITIVE&&bInt.getSign()==Sign.NEGATIVE){
            int l;
            if(S1.length()>S2.length())
                l=S1.length();
            else
                l=S2.length();
            int tDigit=0;
            int temp,Digit;
            int n1,n2;
            for(int i=0;i<l;i++){
                if(d1.peekLast()!=null||d2.peekLast()!=null){
                    if(d1.peekLast()!=null&&d2.peekLast()!=null){
                        n1=parseInt(d1.pollLast());
                        n2=parseInt(d2.pollLast());
                        temp=n1 +n2 +tDigit;
                        tDigit=temp/10;
                        Digit=temp%10;
                        Result.addFirst(String.valueOf(Digit));
                    }
                    else if(d1.peekLast()==null){
                        temp= parseInt(d2.pollLast())+tDigit;
                        tDigit=temp/10;
                        Digit=temp%10;
                        Result.addFirst(String.valueOf(Digit));
                    }
                    else {
                        temp=parseInt(d1.pollLast())+tDigit;
                        tDigit=temp/10;
                        Digit=temp%10;
                        Result.addFirst(String.valueOf(Digit));
                    }
                }
            }
            if(tDigit!=0){
                Result.addFirst(Integer.toString(tDigit));
            }
			isNegative=false;
		}
		while(Result.peekFirst().equals("0")){
		    Result.pollFirst();
            if(Result.peekFirst()==null){
                Result.add("0");
                break;
            }
        }
		if(isNegative==true){
			Result.addFirst("-");
		}
		String r="";
		while(Result.peekFirst()!=null){
		    r=r.concat(Result.pollFirst());
        }
		return new BigInteger(r);
	}

	@Override
	public BigInt add(long bLong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigInt sub(long bLong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigInt add(int bInt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigInt sub(int bInt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPositive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Sign getSign() {
		// TODO Auto-generated method stub
		return sign;
	}

	@Override
	public void setSign(Sign sign) {
		// TODO Auto-generated method stub

	}

	@Override
	public Byte[] getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString(){
		return number;
	}
}
