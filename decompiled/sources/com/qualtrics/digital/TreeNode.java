package com.qualtrics.digital;

/* JADX INFO: loaded from: classes3.dex */
class TreeNode {
    String Comparator;
    String Expression;
    TreeNode Left;
    String LogicType;
    String Operator;
    TreeNode Right;
    String Type;
    Object Value;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    public boolean evaluate() {
        byte b;
        Object obj;
        TreeNode treeNode;
        String str = this.Type;
        str.getClass();
        switch (str) {
            case "ComparatorNode":
                b = 0;
                break;
            case "ConjunctionNode":
                b = 1;
                break;
            case "LogicNode":
                b = 2;
                break;
            case "ValueNode":
                b = 3;
                break;
            default:
                b = -1;
                break;
        }
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        QualtricsLog.logError("Evaluate function called on node with invalid type during logic tree evaluation");
                        return false;
                    }
                    Object obj2 = this.Value;
                    if (obj2 instanceof Boolean) {
                        return ((Boolean) obj2).booleanValue();
                    }
                }
                return false;
            }
            TreeNode treeNode2 = this.Left;
            boolean z = treeNode2 != null && treeNode2.evaluate();
            TreeNode treeNode3 = this.Right;
            boolean z2 = treeNode3 != null && treeNode3.evaluate();
            String str2 = this.Operator;
            str2.getClass();
            if (str2.equals("OR")) {
                return z || z2;
            }
            return str2.equals("AND") && z && z2;
        }
        String str3 = this.Comparator;
        if (str3 == null) {
            QualtricsLog.logError("Evaluate function called on node with null comparator");
            return false;
        }
        TreeNode treeNode4 = this.Left;
        String str4 = treeNode4.LogicType;
        String str5 = treeNode4.Expression;
        if ((this.Value instanceof Boolean) || ((treeNode = this.Right) != null && (treeNode.Value instanceof Boolean))) {
            TreeNode treeNode5 = this.Right;
            if (treeNode5 != null) {
                obj = (Boolean) treeNode5.Value;
            } else {
                obj = null;
            }
        } else if (treeNode != null) {
            obj = (String) treeNode.Value;
        } else {
            obj = null;
        }
        return ComparatorNode.evaluate(str4, str5, obj, str3);
    }
}
