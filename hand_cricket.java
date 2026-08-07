package Projects;
import java.io.FileWriter;
import java.io.File;
import java.util.Random;
import java.util.Scanner;
class bat{
    public int bat_opening(int over,int wh,String user){
        String who ="";
        String opp="";
        if (wh==1){
            who = user;
            opp="System";
        }
        else{
            who = "System";
            opp=user;
        }
        Scanner ms= new Scanner(System.in);
        Random mr = new Random();
        int run=0;
        int co = 0;
        int out=0;
        while ((co<over)&&(out==0)){
            outbreak:
            for (int cb=1;cb<=6;cb++){
                int ball = mr.nextInt(10)+1;
                int ub=0;
                while (ub==0){
                    System.out.println("\nBall "+co+"."+cb+" is coming choose your run a number between from 1-10");
                    ub=ms.nextInt();
                    if ((ub>0)&&(ub<=10)){
                        if (ub!=ball){
                            run+=ub;
                            System.out.println("\n"+who+" score = "+run+" runs");
                        }
                        else{
                            System.out.println("\n"+who+" is out, and made "+run+" runs");
                            out=1;
                            break outbreak;
                        }
                    }
                    else{
                        System.out.println("\nwrong input try again");
                        ub=0;
                    }
                }
            }
            co++;
        }
        System.out.println("\n\n"+ who +" made "+run+" runs in "+co+"overs and target for "+opp+" is of "+(run+1)+" runs");
        return run;
        
    }
    public int bat_chasing(int over,int target,int wh,String user){
        String who ="";
        String opp="";
        if (wh==1){
            who = user;
            opp="System";
        }
        else{
            who = "System";
            opp=user;
        }
        Scanner ms= new Scanner(System.in);
        Random mr = new Random();
        int run=0;
        int co = 0;
        int out=0;
        while ((co<over)&&(out==0)&&(run<target)){
            outbreak:
            for (int cb=1;cb<=6;cb++){
                int ball = mr.nextInt(10)+1;
                int ub=0;
                while (ub==0){
                    System.out.println("\nBall "+co+"."+cb+" is coming choose your run a number between from 1-10");
                    ub=ms.nextInt();
                    if ((ub>0)&&(ub<=10)){
                        if (ub!=ball){
                            run+=ub;
                            if (run>=target){
                                System.out.println("\n"+who+" won by making "+run+" runs in "+co+"."+cb+" overs");
                                break outbreak;
                            }
                            else{
                                System.out.println("\n"+who+" score = "+run+" runs and need "+(target - run)+" runs in "+(((over-co)*6)-cb)+" balls to win");
                            }
                        }
                        else{
                            System.out.println("\n"+who+" are out, and made "+run+" runs");
                            out=1;
                            break outbreak;
                        }
                    }
                    else{
                        System.out.println("\nwrong input try again");
                        ub=0;
                    }
                }
            }
            co++;
        }
        System.out.println("Target was "+target+"\n"+who+" scored "+run+" runs and played "+co+" overs");
        return run;
    }
}
class ball{
    public int ball_opening(int over,int wh,String user){
        String who ="";
        String opp="";
        if (wh==1){
            who = user;
            opp="System";
        }
        else{
            who = "System";
            opp=user;
        }
        Scanner ms= new Scanner(System.in);
        Random mr = new Random();
        int run=0;
        int co = 0;
        int out=0;
        while ((co<over)&&(out==0)){
            outbreak:
            for (int cb=1;cb<=6;cb++){
                int bat = mr.nextInt(10)+1;
                int ub=0;
                while (ub==0){
                    System.out.println("\nBall "+co+"."+cb+" is next choose your number between from 1-10");
                    ub=ms.nextInt();
                    if ((ub>0)&&(ub<=10)){
                        if (ub!=bat){
                            run+=bat;
                            System.out.println("\nSystem's score = "+run+" runs");
                        }
                        else{
                            System.out.println("\nSystem is out, and made "+run+" runs");
                            out=1;
                            break outbreak;
                        }
                    }
                    else{
                        System.out.println("\nwrong input try again");
                        ub=0;
                    }
                }
            }
            co++;
        }
        System.out.println("\n\n"+ who +" made "+run+" runs in "+co+"overs and target for "+opp+" is of "+(run+1)+" runs");
        return run;

    }
    public int ball_finishing(int over,int target,int wh,String user){
        String who ="";
        String opp="";
        if (wh==1){
            who = user;
            opp="System";
        }
        else{
            who = "System";
            opp=user;
        }
        Scanner ms= new Scanner(System.in);
        Random mr = new Random();
        int run=0;
        int co = 0;
        int out=0;
        while ((co<over)&&(out==0)&&(run<target)){
            outbreak:
            for (int cb=1;cb<=6;cb++){
                int bat = mr.nextInt(10)+1;
                int ub=0;
                while (ub==0){
                    System.out.println("\nBall "+co+"."+cb+" is next choose your number between from 1-10");
                    ub=ms.nextInt();
                    if ((ub>0)&&(ub<=10)){
                        if (ub!=bat){
                            run+=bat;
                            if (run>=target){
                                System.out.println("\n"+who+" won by making "+run+" runs in "+co+"."+cb+" overs");
                                break outbreak;
                            }
                            else{
                                System.out.println("\n"+who+" score = "+run+" runs and need "+(target - run)+" runs in "+(((over-co)*6)-cb)+" balls to win");
                            }
                        }
                        else{
                            System.out.println("\n"+who+" is out, and made "+run+" runs");
                            out=1;
                            break outbreak;
                        }
                    }
                    else{
                        System.out.println("\nwrong input try again");
                        ub=0;
                    }
                }
            }
            co++;
        }
        System.out.println("Target was "+target+"\n"+who+" scored "+run+" runs and played "+co+" overs");
        return run;
    }
}
public class hand_cricket {
    public static void main(String[] args) {
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);
        Scanner nc=new Scanner(System.in);
        System.out.println("Enter your name below");
        String user = nc.nextLine();
        int over=0;
        System.out.println("\nEnter number of overs you want to play the match for choose number from 1 to 20");
        while (over==0){
            over = sc.nextInt();
            if ((over >0)&&(over<=20)){
                if (over==1){
                    System.out.println("\nThere are going to be "+over+" over");
                }  
                else{
                    System.out.println("\nThere are going to be "+over+" overs");

                }  
            }
            else{
                over =0;
                System.out.println("\nIncorrect input try again (overs are between 1-20)");
            }
        }
        if (over==1){
            System.out.println("\nLets start "+over+" over match");
        }
        else{
            System.out.println("\nLets start "+over+" overs match");    
        }
        int ut =0;
        int tr=0;
        int user_score=0;
        int system_score=0;
        int super_over=0;
        int user_super_score=0;
        int system_super_score=0;
        int who_won=0;
        int wwt=0;
        int wbf=0;
        int target=0;
        int result =0;
        bat ubat=new bat();
        ball uball = new ball();
        while ((ut!=1) && (ut!=2)){
            int toss = ra.nextInt(2)+1;
            System.out.println("\nToss time for head type 1, for tail type 2");
            ut = sc.nextInt();
            if (ut==toss){
                wwt=1;
                while ((tr!=1) && (tr!=2)){
                    System.out.println("\nCongrats you won the toss!\ntype 1 to bat and 2 to ball first");
                    tr=sc.nextInt();
                    if (tr==1){
                        wbf=1;
                        System.out.println("\nHere comes "+user+" to open with bat");
                        target = ((ubat.bat_opening(over,1,user))+1);
                        user_score=(target-1);
                        System.out.println("\nTarget to our system is of "+target+" runs and lets see can "+user+" defend it");
                        result = uball.ball_finishing(over,target,2,user);
                        system_score=result;
                        if (result>=target){
                            System.out.println("\nSystem won the match");
                            who_won=2;
                        }
                        else if (result==(target-1)){
                            super_over=1;
                            System.out.println("\nmatch is tie lets have super over for 1 over each");
                            System.out.println("\nHere comes the "+user+"to open up with ball for superover");
                            int st=uball.ball_opening(1,2,user);
                            system_super_score=(st-1);
                            System.out.println("\nTarget to "+user+" is of "+st+" runs and lets see can system defend it");
                            int rf=ubat.bat_chasing(1,st,1,user);
                            user_super_score=rf;
                            if (rf==1){
                                System.out.println("\n"+user+" won the match");
                                who_won=1;
                            }
                            else if (rf==2){
                                System.out.println("\nmatch is declared draw");
                                who_won=0;
                            }
                            else {
                                System.out.println("\nSystem won the match");
                                who_won=2;
                            }
                        }
                        else{
                            who_won=1;
                            System.out.println("\n"+user+" won the match");
                        }
                    }
                    else if (tr==2){
                        wbf=2;
                        System.out.println("\nHere comes "+user+" to open with ball");
                        target = ((uball.ball_opening(over,2,user))+1);
                        system_score=(target-1);
                        System.out.println("\nTarget to "+user+" is of "+target+" runs and lets see can "+user+" chase it down");
                        result = ubat.bat_chasing(over,target,1,user);
                        user_score=result;
                        if (result==target){
                            System.out.println("\n"+user+" won the match");
                            who_won=1;
                        }
                        else if (result==(target-1)){
                            super_over=1;
                            System.out.println("match is tie lets have super over for 1 over each");
                            System.out.println("Here comes "+user+"to open with bat for super over");
                            int st=ubat.bat_opening(1,1,user);
                            user_super_score=(st-1);
                            System.out.println("\nTarget to system is of "+st+" runs and lets see can "+user+" defend it");
                            int rf=uball.ball_finishing(1,st,2,user);
                            system_super_score=rf;
                            if (rf==1){
                                who_won=2;
                                System.out.println("\nSystem won the match");
                            }
                            else if (rf==2){
                                who_won=0;
                                System.out.println("\nmatch is declared draw");
                            }
                            else {
                                who_won=1;
                                System.out.println("\n"+user+" won the match");
                            }
                        }
                        else{
                            who_won=2;
                            System.out.println("\nSystem won the match");
                        }
                    }
                    else{
                        System.out.println("invalid input try again");
                        tr=0;
                    }

                }
            }
            else if ((ut!=toss)&&((ut==1)||(ut==2))){
                wwt=2;
                tr = ra.nextInt(2)+1;
                System.out.println(user+" lost the toss");
                if (tr==1){
                    wbf=2;
                    System.out.println("System choose to bat first");
                    System.out.println("\nHere comes "+user+" to open with ball");
                        target = ((uball.ball_opening(over,2,user))+1);
                        system_score=(target-1);
                        System.out.println("\nTarget to "+user+" is of "+target+" runs and lets see can "+user+" chase it down");
                        result = ubat.bat_chasing(over,target,1,user);
                        user_score=result;
                        if (result>=target){
                            who_won=1;
                            System.out.println("\n"+user+" won the match");
                        }
                        else if (result==(target-1)){
                            super_over=1;
                            System.out.println("match is tie lets have super over for 1 over each");
                            System.out.println("Here comes "+user+"to open with bat for super over");
                            int st=ubat.bat_opening(1,1,user);
                            user_super_score=(st-1);
                            System.out.println("\nTarget to system is of "+st+" runs and lets see can "+user+" defend it");
                            int rf=uball.ball_finishing(1,st,2,user);
                            system_super_score=rf;
                            if (rf==1){
                                who_won=2;
                                System.out.println("\nSystem won the match");
                            }
                            else if (rf==2){
                                who_won=0;
                                System.out.println("\nmatch is declared draw");
                            }
                            else {
                                who_won=1;
                                System.out.println("\n"+user+" won the match");
                            }
                        }
                        else{
                            who_won=2;
                            System.out.println("\nSystem won the match");
                        }
                }
                else if (tr == 2){
                    wbf=1;
                    System.out.println("\nSystem coose to ball first");
                    System.out.println("\nHere comes "+user+" to open with bat");
                        target = ((ubat.bat_opening(over,1,user))+1);
                        user_score=(target-1);
                        System.out.println("\nTarget to our system is of "+target+" runs and lets see can "+user+" defend it");
                        result = uball.ball_finishing(over,target,2,user);
                        system_score=result;
                        if (result>=target){
                            who_won=2;
                            System.out.println("\nSystem won the match");
                        }
                        else if (result==(target-1)){
                            super_over=1;
                            System.out.println("\nmatch is tie lets have super over for 1 over each");
                            System.out.println("\nHere comes the "+user+"to open up with ball for superover");
                            int st=uball.ball_opening(1,2,user);
                            system_super_score=(st-1);
                            System.out.println("\nTarget to "+user+" is of "+st+" runs and lets see can system defend it");
                            int rf=ubat.bat_chasing(1,st,1,user);
                            user_super_score=rf;
                            if (rf==1){
                                who_won=1;
                                System.out.println("\n"+user+" won the match");
                            }
                            else if (rf==2){
                                who_won=0;
                                System.out.println("\nmatch is declared draw");
                            }
                            else {
                                who_won=2;
                                System.out.println("\nSystem won the match");
                            }
                        }
                        else{
                            who_won=1;
                            System.out.println("\n"+user+" won the match");
                        }
                }
            }
            else{
                System.out.println("Invalid input try again");
                ut=0;
            }
        }
        try {
            FileWriter mf = new FileWriter("Match_Score.txt",true);
            mf.write("\n\nFINAL MATCH SUMMARY OF "+user+"\n"+"--------------------------------------\n");
            System.out.println("\n\nFINAL MATCH SUMMARY OF "+user);
            System.out.println("--------------------------------------");
            System.out.println("It was a "+over+" overs match");
            mf.write("It was a "+over+" overs match\n");
            if (wwt==1){
                mf.write(user+" won the toss\n");
                System.out.println(user+" won the toss");
                if (wbf==1){
                    mf.write(user+" choose to bat first"+"\n"+user+" scored = "+user_score+" while batting first"+"\nSystem got target of "+(user_score+1)+"\nSystem scored = "+system_score);
                    System.out.println(user+" choose to bat first"+"\n"+user+" scored = "+user_score+" while batting first"+"\nSystem got target of "+(user_score+1)+"\nSystem scored = "+system_score);
                    if (super_over==0){
                        if (who_won==1){
                            mf.write("\n"+user+" won from system by "+(user_score-system_score)+" runs while batting first");
                            System.out.println(user+" won from system by "+(user_score-system_score)+" runs while batting first");
                        }
                        else if (who_won==2){
                            mf.write("\n"+"System chased out the given target of "+(user_score-system_score)+" runs and hence deafeted "+user);
                            System.out.println("System chased out the given target of "+(user_score-system_score)+" runs and hence deafeted "+user);
                        }
                    }
                    else if (super_over==1){
                        if (who_won==1){
                            mf.write("\n"+"Match goen till super over"+"\nSystem opened with bat to score first in super over "+"\nSystem scored = "+system_super_score+" runs and gave target of "+(system_super_score+1)+" runs"+"\n"+user+" chassed it down by scoring = "+user_super_score+"\nFinally "+user+" won after going to super over");
                            System.out.println("Match goen till super over"+"\nSystem opened with bat to score first in super over "+"\nSystem scored = "+system_super_score+" runs and gave target of "+(system_super_score+1)+" runs"+"\n"+user+" chassed it down by scoring = "+user_super_score+"\nFinally "+user+" won after going to super over");
                        }
                        else if (who_won==2){
                            mf.write("\n"+"Match goen till super over"+"\nSystem opened with bat to score first in super over "+"\nSystem scored = "+system_super_score+" runs and gave target of "+(system_super_score+1)+" runs"+"\n"+user+" can't chassed it down by scoring = "+user_super_score+"\nFinally System won after going to super over");
                            System.out.println("Match goen till super over"+"\nSystem opened with bat to score first in super over "+"\nSystem scored = "+system_super_score+" runs and gave target of "+(system_super_score+1)+" runs"+"\n"+user+" can't chassed it down by scoring = "+user_super_score+"\nFinally System won after going to super over");
                        }
                        else if (who_won==0){
                            mf.write("\n"+"Match goen till super over"+"\nSystem opened with bat to score first in super over "+"\nSystem scored = "+system_super_score+" runs and gave target of "+(system_super_score+1)+" runs"+"\n"+user+" also tried to chassed it down by scoring = "+user_super_score+"\nBut at the end the match officially drawed after going to super over");
                            System.out.println("Match goen till super over"+"\nSystem opened with bat to score first in super over "+"\nSystem scored = "+system_super_score+" runs and gave target of "+(system_super_score+1)+" runs"+"\n"+user+" also tried to chassed it down by scoring = "+user_super_score+"\nBut at the end the match officially drawed after going to super over");
                        }

                    }

                    
                }
                else if (wbf==2){
                    mf.write("\n"+user+" choose to ball first"+"\nSystem scored = "+system_score+" while batting first"+"\n"+user+" got target of "+(system_score+1)+"\n"+user+" scored = "+user_score);
                    System.out.println(user+" choose to ball first"+"\nSystem scored = "+system_score+" while batting first"+"\n"+user+" got target of "+(system_score+1)+"\n"+user+" scored = "+user_score);
                    if (super_over==0){
                        if (who_won==1){
                            mf.write("\n"+user+" won from system by "+(user_score-system_score)+" runs while chasing the target");
                        System.out.println(user+" won from system by "+(user_score-system_score)+" runs while chasing the target");
                        }
                        else if (who_won==2){
                            mf.write("\n"+"System blewed away "+user+"'s chase for given target of "+(user_score-system_score)+" runs and hence deafeted "+user);
                            System.out.println("System blewed away "+user+"'s chase for given target of "+(user_score-system_score)+" runs and hence deafeted "+user);
                        }
                    }
                    else if (super_over==1){
                        if (who_won==1){
                            mf.write("\n"+"Match goen till super over"+"\n"+user+" opened with bat to score first in super over "+"\n"+user+" scored = "+user_super_score+" runs and gave target of "+(user_super_score+1)+" runs"+"\nSystem couldn't chassed it down by scoring = "+system_super_score+"\nFinally "+user+" won after going to super over");
                            System.out.println("Match goen till super over"+"\n"+user+" opened with bat to score first in super over "+"\n"+user+" scored = "+user_super_score+" runs and gave target of "+(user_super_score+1)+" runs"+"\nSystem couldn't chassed it down by scoring = "+system_super_score+"\nFinally "+user+" won after going to super over");
                        }
                        else if (who_won==2){
                            mf.write("\n"+"Match goen till super over"+"\n"+user+" opened with bat to score first in super over "+"\n"+user+" scored = "+user_super_score+" runs and gave target of "+(user_super_score+1)+" runs"+"\nSystem chassed it down by scoring = "+system_super_score+"\nFinally System won after going to super over");
                            System.out.println("Match goen till super over"+"\n"+user+" opened with bat to score first in super over "+"\n"+user+" scored = "+user_super_score+" runs and gave target of "+(user_super_score+1)+" runs"+"\nSystem chassed it down by scoring = "+system_super_score+"\nFinally System won after going to super over");
                        }
                        else if (who_won==0){
                            mf.write("\n"+"Match goen till super over"+"\n"+user+" opened with bat to score first in super over "+"\n"+user+" scored = "+user_super_score+" runs and gave target of "+(user_super_score+1)+" runs"+"\nSystem tried to chassed it down by scoring = "+system_super_score+" runs but just got equal"+"\nBut at the end the match officially drawed after going to super over");
                            System.out.println("Match goen till super over"+"\n"+user+" opened with bat to score first in super over "+"\n"+user+" scored = "+user_super_score+" runs and gave target of "+(user_super_score+1)+" runs"+"\nSystem tried to chassed it down by scoring = "+system_super_score+" runs but just got equal"+"\nBut at the end the match officially drawed after going to super over");
                        }
                    }
                }
            }
            else if (wwt==2){
                mf.write("System won the toss");
                System.out.println("System won the toss");
                if (wbf==1){
                    mf.write("\n"+"System choose to ball first"+"\n"+user+" scored = "+user_score+" while batting first"+"\nSystem got target of "+(user_score+1)+"\nSystem scored = "+system_score);
                    System.out.println("System choose to ball first"+"\n"+user+" scored = "+user_score+" while batting first"+"\nSystem got target of "+(user_score+1)+"\nSystem scored = "+system_score);
                    if (super_over==0){
                        if (who_won==1){
                            mf.write("\n"+user+" won from system by "+(user_score-system_score)+" runs while batting first");
                            System.out.println(user+" won from system by "+(user_score-system_score)+" runs while batting first");
                        }
                        else if (who_won==2){
                            mf.write("\n"+"System chased out the given target of "+(user_score-system_score)+" runs and hence deafeted "+user);
                            System.out.println("System chased out the given target of "+(user_score-system_score)+" runs and hence deafeted "+user);
                        }
                    }
                    else if (super_over==1){
                        if (who_won==1){
                            mf.write("\n"+"Match goen till super over"+"\nSystem opened with bat to score first in super over "+"\nSystem scored = "+system_super_score+" runs and gave target of "+(system_super_score+1)+" runs"+"\n"+user+" chassed it down by scoring = "+user_super_score+"\nFinally "+user+" won after going to super over");
                            System.out.println("Match goen till super over"+"\nSystem opened with bat to score first in super over "+"\nSystem scored = "+system_super_score+" runs and gave target of "+(system_super_score+1)+" runs"+"\n"+user+" chassed it down by scoring = "+user_super_score+"\nFinally "+user+" won after going to super over");
                        }
                        else if (who_won==2){
                            mf.write("\n"+"Match goen till super over"+"\nSystem opened with bat to score first in super over"+"\nSystem scored = "+system_super_score+" runs and gave target of "+(system_super_score+1)+" runs"+"\n"+user+" can't chassed it down by scoring = "+user_super_score+"\nFinally System won after going to super over");
                            System.out.println("Match goen till super over"+"\nSystem opened with bat to score first in super over"+"\nSystem scored = "+system_super_score+" runs and gave target of "+(system_super_score+1)+" runs"+"\n"+user+" can't chassed it down by scoring = "+user_super_score+"\nFinally System won after going to super over");
                        }
                        else if (who_won==0){
                            mf.write("\n"+"Match goen till super over"+"\nSystem opened with bat to score first in super over "+"\nSystem scored = "+system_super_score+" runs and gave target of "+(system_super_score+1)+" runs"+"\n"+user+" also tried to chassed it down by scoring = "+user_super_score+"\nBut at the end the match officially drawed after going to super over");
                            System.out.println("Match goen till super over"+"\nSystem opened with bat to score first in super over "+"\nSystem scored = "+system_super_score+" runs and gave target of "+(system_super_score+1)+" runs"+"\n"+user+" also tried to chassed it down by scoring = "+user_super_score+"\nBut at the end the match officially drawed after going to super over");
                        }

                    }

                    
                }
                else if (wbf==2){
                    mf.write("\n"+"System choose to bat first"+"\nSystem scored = "+system_score+" while batting first"+"\n"+user+" got target of "+(system_score+1)+"\n"+user+" scored = "+user_score);
                    System.out.println("System choose to bat first"+"\nSystem scored = "+system_score+" while batting first"+"\n"+user+" got target of "+(system_score+1)+"\n"+user+" scored = "+user_score);
                    if (super_over==0){
                        if (who_won==1){
                            mf.write("\n"+user+" won from system by "+(user_score-system_score)+" runs while chasing the target");
                        System.out.println(user+" won from system by "+(user_score-system_score)+" runs while chasing the target");
                        }
                        else if (who_won==2){
                            mf.write("\n"+"System blewed away "+user+"'s chase for given target of "+(user_score-system_score)+" runs and hence deafeted "+user);
                            System.out.println("System blewed away "+user+"'s chase for given target of "+(user_score-system_score)+" runs and hence deafeted "+user);
                        }
                    }
                    else if (super_over==1){
                        if (who_won==1){
                            mf.write("\n"+"Match goen till super over"+"\n"+user+" opened with bat to score first in super over "+"\n"+user+" scored = "+user_super_score+" runs and gave target of "+(user_super_score+1)+" runs"+"\nSystem couldn't chassed it down by scoring = "+system_super_score+"\nFinally "+user+" won after going to super over");
                            System.out.println("Match goen till super over"+"\n"+user+" opened with bat to score first in super over "+"\n"+user+" scored = "+user_super_score+" runs and gave target of "+(user_super_score+1)+" runs"+"\nSystem couldn't chassed it down by scoring = "+system_super_score+"\nFinally "+user+" won after going to super over");
                        }
                        else if (who_won==2){
                            mf.write("\n"+"Match goen till super over"+"\n"+user+" opened with bat to score first in super over "+"\n"+user+" scored = "+user_super_score+" runs and gave target of "+(user_super_score+1)+" runs"+"\nSystem chassed it down by scoring = "+system_super_score+"\nFinally System won after going to super over");
                            System.out.println("Match goen till super over"+"\n"+user+" opened with bat to score first in super over "+"\n"+user+" scored = "+user_super_score+" runs and gave target of "+(user_super_score+1)+" runs"+"\nSystem chassed it down by scoring = "+system_super_score+"\nFinally System won after going to super over");
                        }
                        else if (who_won==0){
                            mf.write("\n"+"Match goen till super over"+"\n"+user+" opened with bat to score first in super over "+"\n"+user+" scored = "+user_super_score+" runs and gave target of "+(user_super_score+1)+" runs"+"\nSystem tried to chassed it down by scoring = "+system_super_score+" runs but just got equal"+"\nBut at the end the match officially drawed after going to super over");
                            System.out.println("Match goen till super over"+"\n"+user+" opened with bat to score first in super over "+"\n"+user+" scored = "+user_super_score+" runs and gave target of "+(user_super_score+1)+" runs"+"\nSystem tried to chassed it down by scoring = "+system_super_score+" runs but just got equal"+"\nBut at the end the match officially drawed after going to super over");
                        }
                    }
                }
            }
            System.out.println("--------------------------------------");
            mf.write("\n--------------------------------------");
            mf.close();
    }
    catch(Exception e){
        System.out.println("error occurred");
    }
    }
}    
