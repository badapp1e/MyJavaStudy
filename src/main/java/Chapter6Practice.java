import com.hc.ccbft.List;

import static com.hc.ccbft.debug.Debug.*;
import com.hc.ccbft.debugoff.Debug.*;

/*
章节6：访问权限控制
 */
class Connection {
    private Connection() { System.out.println("Connection established.");}
    static Connection makeConnection() {
        return new Connection();
    }
}

public class Chapter6Practice {
    /*
    练习一：包冲突
     */
    static void packageClash() {
        java.util.List<Integer> a = new java.util.ArrayList<Integer>();
        List b = new List();
    }

    /*
    练习三：静态import，条件编译
     */
    static void staticImport() {
        debug("sss");
    }

    /*
    练习八：访问控制
     */
    static int maxConnection = 3;
    static Connection[] cons = new Connection[3];
    static {
        for (Connection i : cons
        ) {
            Connection.makeConnection();
        }
    }

    public static Connection getConnection() {
        if (maxConnection > 0)
            return cons[--maxConnection];
        else {
            System.out.println("no more connections.");
            return null;
        }
    }

    public static void main(String[] args) {
        getConnection();
        getConnection();
        getConnection();
        getConnection();
    }
}
