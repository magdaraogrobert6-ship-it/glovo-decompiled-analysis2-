package o;

import com.google.firestore.v1.Value;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class getOnPlacedOLwlOKw implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public static final getOnPlacedOLwlOKw write = new getOnPlacedOLwlOKw(0);
    public static final getOnPlacedOLwlOKw read = new getOnPlacedOLwlOKw(1);

    public /* synthetic */ getOnPlacedOLwlOKw(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        Value valueWrite;
        int i;
        Value valueWrite2;
        InspectableModifier inspectableModifierSerializer = null;
        if (this.IconCompatParcelizer == 0) {
            String str = (String) obj;
            String str2 = (String) obj2;
            str.getClass();
            str2.getClass();
            try {
                inspectableModifierSerializer = InspectableModifier.serializer(str2);
            } catch (Exception unused) {
            }
            if (inspectableModifierSerializer == null) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
            InputMethodSession inputMethodSession = new InputMethodSession(inspectableModifierSerializer, str);
            if (!inspectableModifierSerializer.read.IconCompatParcelizer(inputMethodSession.MediaMetadataCompat, 0, inputMethodSession.MediaDescriptionCompat, 0, inputMethodSession.RemoteActionCompatParcelizer, 1)) {
                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
            }
            inputMethodSession.serializer = true;
            inputMethodSession.IconCompatParcelizer = false;
            inputMethodSession.write = 0;
            try {
                getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                int i2 = inputMethodSession.read;
                if (i2 > 1) {
                    throw new IllegalArgumentException("At most one capture group is supported");
                }
                if (i2 == 0) {
                    String str3 = inputMethodSession.read(0);
                    str3.getClass();
                    valueWrite = NodeCoordinatorCompaniononCommitAffectingLayer1.write(str3);
                } else if (inputMethodSession.read(1) != null) {
                    String str4 = inputMethodSession.read(1);
                    str4.getClass();
                    valueWrite = NodeCoordinatorCompaniononCommitAffectingLayer1.write(str4);
                } else {
                    valueWrite = NodeCoordinatorCompaniononCommitAffectingLayer1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                }
                valueWrite.getClass();
                return new getDrawOLwlOKwannotations(valueWrite);
            } catch (IllegalArgumentException unused2) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
        }
        String str5 = (String) obj;
        String str6 = (String) obj2;
        str5.getClass();
        str6.getClass();
        try {
            inspectableModifierSerializer = InspectableModifier.serializer(str6);
        } catch (Exception unused3) {
        }
        if (inspectableModifierSerializer == null) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        DepthSortedSet depthSortedSet = delegateUnprotectedui.write;
        androidx.sqlite.SQLite.serializer(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        InputMethodSession inputMethodSession2 = new InputMethodSession(inspectableModifierSerializer, str5);
        int i3 = 0;
        while (true) {
            try {
                int[] iArr = inputMethodSession2.RemoteActionCompatParcelizer;
                if (inputMethodSession2.serializer) {
                    int i4 = iArr[1];
                    if (iArr[0] == i4) {
                        i4++;
                    }
                    i = i4;
                } else {
                    i = 0;
                }
                if (!inputMethodSession2.RatingCompat.read.IconCompatParcelizer(inputMethodSession2.MediaMetadataCompat, i, inputMethodSession2.MediaDescriptionCompat, 0, iArr, 1)) {
                    getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                    accessgetApproachSetp accessgetapproachsetpIconCompatParcelizer = delegateUnprotectedui.IconCompatParcelizer(i3, objArrCopyOf);
                    accessgetapproachsetpIconCompatParcelizer.getClass();
                    return new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.write(accessgetapproachsetpIconCompatParcelizer));
                }
                inputMethodSession2.serializer = true;
                inputMethodSession2.IconCompatParcelizer = false;
                inputMethodSession2.write = 0;
                int i5 = inputMethodSession2.read;
                if (i5 > 1) {
                    throw new IllegalArgumentException("At most one capture group is supported");
                }
                if (i5 == 0) {
                    String str7 = inputMethodSession2.read(0);
                    str7.getClass();
                    valueWrite2 = NodeCoordinatorCompaniononCommitAffectingLayer1.write(str7);
                } else if (inputMethodSession2.read(1) != null) {
                    String str8 = inputMethodSession2.read(1);
                    str8.getClass();
                    valueWrite2 = NodeCoordinatorCompaniononCommitAffectingLayer1.write(str8);
                } else {
                    valueWrite2 = NodeCoordinatorCompaniononCommitAffectingLayer1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                }
                valueWrite2.getClass();
                int i6 = i3 + 1;
                if (objArrCopyOf.length < i6) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, JsonUtilsc.write(objArrCopyOf.length, i6));
                }
                objArrCopyOf[i3] = valueWrite2;
                i3 = i6;
            } catch (IllegalArgumentException unused4) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
        }
    }
}
