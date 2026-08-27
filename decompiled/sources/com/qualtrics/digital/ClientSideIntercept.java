package com.qualtrics.digital;

import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class ClientSideIntercept {
    public static int RemoteActionCompatParcelizer;
    public static int write;
    ArrayList<CSTActionSet> ActionSets;
    Boolean Active;
    Boolean ContactFrequencyRulesEnabled;
    String ContactID;
    String DirectoryID;
    String InterceptID;
    String InterceptRevision;
    TreeNode LogicTree;
    String PreventRepeatedDisplay;
    Boolean RandomizedActionSets;

    public static int RemoteActionCompatParcelizer() {
        int i = write;
        int i2 = i % 7173866;
        write = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int iNextInt = new Random().nextInt();
        RemoteActionCompatParcelizer = iNextInt;
        return iNextInt;
    }
}
