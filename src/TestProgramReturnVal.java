// 0 (zero) is considered a proper return value
// all else is considered an error by the operating system

// in mac, run this program then run 
// echo $?

// in windows, run this program then run
// $LASTEXITCODE

public class TestProgramReturnVal {
    public static void main(String[] args){
        System.exit(5);
    }
}
