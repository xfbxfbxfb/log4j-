public class exp {
    static {
        try {
//操作windows
              String [] cmd={"calc"};//打开计算机
//            String [] cmd={"notepad"};//打开记事本
            java.lang.Runtime.getRuntime().exec(cmd).waitFor();
//操作linux
//            String [] cmd={"touch 1.txt"};
//            java.lang.Runtime.getRuntime().exec(cmd).waitFor();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}