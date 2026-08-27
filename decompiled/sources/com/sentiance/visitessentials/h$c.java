package com.sentiance.visitessentials;

import android.text.SpannableString;
import android.text.style.URLSpan;
import android.util.Rational;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.button.MaterialButton;
import com.mapbox.navigation.base.route.NavigationRoute;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.NodeCoordinatorCompaniononCommitAffectingLayer1;
import o.accessgetOnCommitAffectingLayercp;
import o.accessgetSnapshotObserver;
import o.childHitTestqzLsGqo;
import o.outermostOf;
import o.r8lambdaSA7KRr6XvTIu0qbXsLySA6yLoM;
import o.r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class h$c implements Comparator {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final Object read;
    public final /* synthetic */ int write;

    public h$c(List list) {
        this.write = 3;
        Iterator it = list.iterator();
        int i = 2 % 2;
        while (true) {
            boolean z = false;
            while (true) {
                Object obj = null;
                if (!it.hasNext()) {
                    if (!z) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("QueryComparator needs to have a key ordering");
                        throw null;
                    }
                    int i2 = IconCompatParcelizer + 77;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        this.read = list;
                        return;
                    } else {
                        this.read = list;
                        obj.hashCode();
                        throw null;
                    }
                }
                int i3 = IconCompatParcelizer + 37;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    throw null;
                }
                accessgetSnapshotObserver accessgetsnapshotobserver = (accessgetSnapshotObserver) it.next();
                if (z || accessgetsnapshotobserver.RemoteActionCompatParcelizer.equals(childHitTestqzLsGqo.write)) {
                    int i4 = RemoteActionCompatParcelizer + 71;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    z = true;
                }
            }
        }
    }

    public /* synthetic */ h$c(int i, Object obj) {
        this.write = i;
        this.read = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        int iRemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Integer num = null;
        if (i2 % 2 == 0) {
            num.hashCode();
            throw null;
        }
        int i3 = this.write;
        Object obj3 = this.read;
        if (i3 == 0) {
            String str = (String) obj;
            r8lambdaSA7KRr6XvTIu0qbXsLySA6yLoM r8lambdasa7krr6xvtiu0qbxslysa6ylom = (r8lambdaSA7KRr6XvTIu0qbXsLySA6yLoM) obj3;
            r8lambdasa7krr6xvtiu0qbxslysa6ylom.getClass();
            str.getClass();
            Map map = r8lambdasa7krr6xvtiu0qbxslysa6ylom.a;
            r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM r8lambdab0isqpsb2j3nkxpxcm79mddzdtm = (r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM) map.get(str);
            if (r8lambdab0isqpsb2j3nkxpxcm79mddzdtm != null) {
                int i4 = IconCompatParcelizer + 11;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                numValueOf = Integer.valueOf(r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.a);
            } else {
                numValueOf = null;
            }
            String str2 = (String) obj2;
            str2.getClass();
            r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM r8lambdab0isqpsb2j3nkxpxcm79mddzdtm2 = (r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM) map.get(str2);
            return setNativeShader.RemoteActionCompatParcelizer(numValueOf, r8lambdab0isqpsb2j3nkxpxcm79mddzdtm2 != null ? Integer.valueOf(r8lambdab0isqpsb2j3nkxpxcm79mddzdtm2.a) : null);
        }
        if (i3 == 1) {
            Rational rational = (Rational) obj2;
            Rational rational2 = (Rational) obj3;
            float fFloatValue = ((Rational) obj).floatValue();
            float fFloatValue2 = rational2.floatValue();
            float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
            float fFloatValue3 = rational.floatValue();
            float fFloatValue4 = rational2.floatValue();
            return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
        }
        if (i3 == 2) {
            MaterialButton materialButton = (MaterialButton) obj;
            MaterialButton materialButton2 = (MaterialButton) obj2;
            outermostOf outermostof = (outermostOf) obj3;
            int iCompareTo = Boolean.valueOf(materialButton.MediaSessionCompatQueueItem).compareTo(Boolean.valueOf(materialButton2.MediaSessionCompatQueueItem));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (iCompareTo2 == 0) {
                return Integer.valueOf(outermostof.indexOfChild(materialButton)).compareTo(Integer.valueOf(outermostof.indexOfChild(materialButton2)));
            }
            int i6 = RemoteActionCompatParcelizer + 31;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return iCompareTo2;
        }
        if (i3 != 3) {
            if (i3 != 4) {
                SpannableString spannableString = (SpannableString) obj3;
                return setNativeShader.RemoteActionCompatParcelizer(Integer.valueOf(spannableString.getSpanStart((URLSpan) obj)), Integer.valueOf(spannableString.getSpanStart((URLSpan) obj2)));
            }
            ArrayList arrayList = (ArrayList) obj3;
            return setNativeShader.RemoteActionCompatParcelizer(Integer.valueOf(arrayList.indexOf(((NavigationRoute) obj).nativeRoute)), Integer.valueOf(arrayList.indexOf(((NavigationRoute) obj2).nativeRoute)));
        }
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
        for (accessgetSnapshotObserver accessgetsnapshotobserver : (List) obj3) {
            int i8 = IconCompatParcelizer + 35;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            accessgetOnCommitAffectingLayercp accessgetoncommitaffectinglayercp = accessgetsnapshotobserver.write;
            childHitTestqzLsGqo childhittestqzlsgqo = accessgetsnapshotobserver.RemoteActionCompatParcelizer;
            if (childhittestqzlsgqo.equals(childHitTestqzLsGqo.write)) {
                int i10 = IconCompatParcelizer + 77;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                iRemoteActionCompatParcelizer = i10 % 2 != 0 ? nodeCoordinatorCompanionPointerInputSource1.read.compareTo(nodeCoordinatorCompanionPointerInputSource2.read) << accessgetoncommitaffectinglayercp.getComparisonModifier() : accessgetoncommitaffectinglayercp.getComparisonModifier() * nodeCoordinatorCompanionPointerInputSource1.read.compareTo(nodeCoordinatorCompanionPointerInputSource2.read);
                int i11 = IconCompatParcelizer + 89;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            } else {
                iRemoteActionCompatParcelizer = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1.write.write(childhittestqzlsgqo), nodeCoordinatorCompanionPointerInputSource2.write.write(childhittestqzlsgqo)) * accessgetoncommitaffectinglayercp.getComparisonModifier();
            }
            if (iRemoteActionCompatParcelizer != 0) {
                return iRemoteActionCompatParcelizer;
            }
        }
        return 0;
    }
}
