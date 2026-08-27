package o;

import com.google.android.gms.measurement.internal.zzpg;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class MeasurePolicy implements Callable {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ LookaheadScopeKtdefaultPlacementApproachInProgress1 RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ MeasurePolicy(LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1, String str, String str2, String str3, int i) {
        this.serializer = i;
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.RemoteActionCompatParcelizer = lookaheadScopeKtdefaultPlacementApproachInProgress1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.serializer;
        String str = this.read;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.write;
        LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.serializer();
            LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1 = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy1);
            return layoutNodeSubcompositionsStatecreateMeasurePolicy1.write(str3, str2, str);
        }
        if (i == 1) {
            lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.serializer();
            LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy2 = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy2);
            return layoutNodeSubcompositionsStatecreateMeasurePolicy2.write(str3, str2, str);
        }
        if (i != 2) {
            lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.serializer();
            LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy3 = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy3);
            return layoutNodeSubcompositionsStatecreateMeasurePolicy3.IconCompatParcelizer(str3, str2, str);
        }
        lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.serializer();
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy4 = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy4);
        return layoutNodeSubcompositionsStatecreateMeasurePolicy4.IconCompatParcelizer(str3, str2, str);
    }
}
