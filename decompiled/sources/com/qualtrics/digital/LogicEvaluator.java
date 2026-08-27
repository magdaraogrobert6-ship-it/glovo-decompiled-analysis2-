package com.qualtrics.digital;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
abstract class LogicEvaluator {
    private boolean evaluateClause(ArrayList<? extends IEvaluable> arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator<? extends IEvaluable> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!it.next().evaluate()) {
                return false;
            }
        }
        return true;
    }

    public boolean evaluateLogic(ArrayList<? extends IEvaluable> arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (IEvaluable iEvaluable : arrayList) {
            if (iEvaluable.isBaseCondition() || iEvaluable.hasAndConjunction()) {
                arrayList3.add(iEvaluable);
            } else {
                if (!iEvaluable.hasOrConjunction()) {
                    return false;
                }
                arrayList2.add(new ArrayList(arrayList3));
                arrayList3 = new ArrayList();
                arrayList3.add(iEvaluable);
            }
        }
        arrayList2.add(new ArrayList(arrayList3));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (evaluateClause((ArrayList) it.next())) {
                return true;
            }
        }
        return false;
    }
}
