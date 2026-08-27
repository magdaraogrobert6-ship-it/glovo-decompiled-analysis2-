package androidx.compose.ui.node;

/* JADX INFO: loaded from: classes.dex */
public final class MyersDiffKt {
    private static final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < intStack.getSize()) {
            int i4 = intStack.get(i);
            int i5 = i + 2;
            int i6 = intStack.get(i5);
            int i7 = intStack.get(i + 1);
            int i8 = intStack.get(i5);
            i += 3;
            while (i3 < i4 - i6) {
                diffCallback.remove(i2, i3);
                i3++;
            }
            while (i2 < i7 - i8) {
                diffCallback.insert(i2);
                i2++;
            }
            for (int i9 = intStack.get(i5); i9 > 0; i9--) {
                diffCallback.same(i3, i2);
                i3++;
                i2++;
            }
        }
    }

    public static final void executeDiff(int i, int i2, DiffCallback diffCallback) {
        applyDiff(calculateDiff(i, i2, diffCallback), diffCallback);
    }

    public static final void fillSnake(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    private static final IntStack calculateDiff(int i, int i2, DiffCallback diffCallback) {
        int i3 = ((i + i2) + 1) / 2;
        IntStack intStack = new IntStack(i3 * 3);
        IntStack intStack2 = new IntStack(i3 * 4);
        intStack2.pushRange(0, i, 0, i2);
        int i4 = (i3 * 2) + 1;
        int[] iArrM2375constructorimpl = CenteredArray.m2375constructorimpl(new int[i4]);
        int[] iArrM2375constructorimpl2 = CenteredArray.m2375constructorimpl(new int[i4]);
        int[] iArrM2622constructorimpl = Snake.m2622constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            int[] iArr = iArrM2622constructorimpl;
            if (m2504midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback, iArrM2375constructorimpl, iArrM2375constructorimpl2, iArr)) {
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]) > 0) {
                    Snake.m2620addDiagonalToStackimpl(iArr, intStack);
                }
                intStack2.pushRange(iPop4, iArr[0], iPop2, iArr[1]);
                intStack2.pushRange(iArr[2], iPop3, iArr[3], iPop);
                iArrM2622constructorimpl = iArr;
            } else {
                iArrM2622constructorimpl = iArr;
            }
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i, i2, 0);
        return intStack;
    }

    /* JADX INFO: renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m2503forward4l5_RBY(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int iM2378getimpl;
        int i6;
        int i7 = i2;
        int i8 = (i7 - i) - (i4 - i3);
        int i9 = 1;
        boolean z = (Math.abs(i8) & 1) == 1;
        int i10 = -i5;
        int i11 = i10;
        while (i11 <= i5) {
            if (i11 != i10 && (i11 == i5 || CenteredArray.m2378getimpl(iArr, i11 + 1) <= CenteredArray.m2378getimpl(iArr, i11 - 1))) {
                iM2378getimpl = CenteredArray.m2378getimpl(iArr, i11 - 1);
                i6 = iM2378getimpl + 1;
            } else {
                iM2378getimpl = CenteredArray.m2378getimpl(iArr, i11 + 1);
                i6 = iM2378getimpl;
            }
            int i12 = ((i6 - i) + i3) - i11;
            int i13 = i5 != 0 ? i9 : 0;
            int i14 = i6 == iM2378getimpl ? i9 : 0;
            int i15 = i12;
            while (true) {
                if (i6 < i7 && i15 < i4) {
                    if (!diffCallback.areItemsTheSame(i6, i15)) {
                        break;
                    }
                    i6++;
                    i15++;
                } else {
                    break;
                }
            }
            CenteredArray.m2381setimpl(iArr, i11, i6);
            if (z) {
                int i16 = i8 - i11;
                if (i16 >= i10 + 1 && i16 <= i5 - 1) {
                    if (CenteredArray.m2378getimpl(iArr2, i16) <= i6) {
                        fillSnake(iM2378getimpl, i12 - (i13 & i14), i6, i15, false, iArr3);
                        return true;
                    }
                }
                i9 = 1;
            }
            i11 += 2;
            i7 = i2;
        }
        return false;
    }

    /* JADX INFO: renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m2504midPointq5eDKzI(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 >= 1 && i6 >= 1) {
            int i7 = ((i5 + i6) + 1) / 2;
            CenteredArray.m2381setimpl(iArr, 1, i);
            CenteredArray.m2381setimpl(iArr2, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8;
                if (m2503forward4l5_RBY(i, i2, i3, i4, diffCallback, iArr, iArr2, i8, iArr3) || m2502backward4l5_RBY(i, i2, i3, i4, diffCallback, iArr, iArr2, i9, iArr3)) {
                    return true;
                }
                i8 = i9 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m2502backward4l5_RBY(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int iM2378getimpl;
        int i6;
        int i7;
        int i8 = i;
        int i9 = (i2 - i8) - (i4 - i3);
        boolean z = (i9 & 1) == 0;
        int i10 = -i5;
        int i11 = i10;
        while (i11 <= i5) {
            if (i11 != i10 && (i11 == i5 || CenteredArray.m2378getimpl(iArr2, i11 + 1) >= CenteredArray.m2378getimpl(iArr2, i11 - 1))) {
                iM2378getimpl = CenteredArray.m2378getimpl(iArr2, i11 - 1);
                i6 = iM2378getimpl - 1;
            } else {
                iM2378getimpl = CenteredArray.m2378getimpl(iArr2, i11 + 1);
                i6 = iM2378getimpl;
            }
            int i12 = i4 - ((i2 - i6) - i11);
            int i13 = i5 != 0 ? 1 : 0;
            int i14 = i6 == iM2378getimpl ? 1 : 0;
            int i15 = i12;
            while (true) {
                if (i6 > i8 && i15 > i3) {
                    if (!diffCallback.areItemsTheSame(i6 - 1, i15 - 1)) {
                        break;
                    }
                    i6--;
                    i15--;
                    i8 = i;
                } else {
                    break;
                }
            }
            CenteredArray.m2381setimpl(iArr2, i11, i6);
            if (z && (i7 = i9 - i11) >= i10 && i7 <= i5) {
                if (CenteredArray.m2378getimpl(iArr, i7) >= i6) {
                    fillSnake(i6, i15, iM2378getimpl, (i13 & i14) + i12, true, iArr3);
                    return true;
                }
            }
            i11 += 2;
            i8 = i;
        }
        return false;
    }
}
