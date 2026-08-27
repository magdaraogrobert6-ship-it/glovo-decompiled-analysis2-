package com.qualtrics.digital;

/* JADX INFO: loaded from: classes5.dex */
interface IEvaluable {
    boolean evaluate();

    boolean hasAndConjunction();

    boolean hasOrConjunction();

    boolean isBaseCondition();
}
