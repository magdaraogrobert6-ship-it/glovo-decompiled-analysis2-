package o;

import coil3.Extras$Key;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class captureRulersOSxE8f4 implements LookaheadAlignmentLines {
    public final nodeToString IconCompatParcelizer;
    public final HashSet serializer;

    @Override // o.LookaheadAlignmentLines
    public final void serializer(Set set) {
        HashSet hashSet = this.serializer;
        hashSet.clear();
        HashSet hashSet2 = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet2.size() >= 50) {
                break;
            }
            undelegateUnprotectedui undelegateunprotectedui = addRulerReader.RemoteActionCompatParcelizer;
            if (str != null && str.length() != 0) {
                int iCodePointAt = str.codePointAt(0);
                if (!Character.isLetter(iCodePointAt)) {
                    if (iCodePointAt == 95) {
                        iCodePointAt = 95;
                    }
                }
                int length = str.length();
                int iCharCount = Character.charCount(iCodePointAt);
                while (true) {
                    if (iCharCount >= length) {
                        if (str.length() == 0) {
                            break;
                        }
                        int iCodePointAt2 = str.codePointAt(0);
                        if (!Character.isLetter(iCodePointAt2)) {
                            break;
                        }
                        int length2 = str.length();
                        int iCharCount2 = Character.charCount(iCodePointAt2);
                        while (true) {
                            if (iCharCount2 < length2) {
                                int iCodePointAt3 = str.codePointAt(iCharCount2);
                                if (iCodePointAt3 != 95 && !Character.isLetterOrDigit(iCodePointAt3)) {
                                    break;
                                } else {
                                    iCharCount2 += Character.charCount(iCodePointAt3);
                                }
                            } else {
                                String str2 = (String) TuplesKt.RemoteActionCompatParcelizer(1514272013, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{str, Measured.IconCompatParcelizer, Measured.RemoteActionCompatParcelizer}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -1514272013);
                                if (str2 != null) {
                                    str = str2;
                                }
                                hashSet2.add(str);
                                break;
                            }
                        }
                    } else {
                        int iCodePointAt4 = str.codePointAt(iCharCount);
                        if (iCodePointAt4 != 95 && !Character.isLetterOrDigit(iCodePointAt4)) {
                            break;
                        } else {
                            iCharCount += Character.charCount(iCodePointAt4);
                        }
                    }
                }
            }
        }
        hashSet.addAll(hashSet2);
    }

    public captureRulersOSxE8f4(Extras$Key extras$Key, nodeToString nodetostring) {
        this.IconCompatParcelizer = nodetostring;
        ((getSoftRightEK5gGoQ) extras$Key.IconCompatParcelizer).read(new OnSizeChangedNode(1, this));
        this.serializer = new HashSet();
    }
}
