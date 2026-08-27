package com.roadrunner.web.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.thrift.O$b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AudioAttributesImplBaseParcelizer;
import o.BrazeExternalSyntheticLambda9;
import o.BrazeExternalSyntheticLambda96;
import o.BrazeExternalSyntheticLambda99;
import o.FragmentNavigatorExternalSyntheticLambda0;
import o.NavHostFragment;
import o.NavHostFragmentExternalSyntheticLambda1;
import o.ShortNewsContentCardView;
import o.absolutePath;
import o.access000;
import o.accessgetInstancedelegatecp;
import o.accessgetShouldMockNetworkRequestsAndDropEventscp;
import o.fieldToInteger;
import o.getCieXyz;
import o.getInputTextSuggestionStatedelegate;
import o.getTraversalIndexdelegate;
import o.invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21;
import o.onContentCardDismissed;
import o.performOptionsMenuClosed;
import o.r8lambdaemiioW_nKh79YyPl9R1HU3hWdFc;
import o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdajbxBm0A7iJGxAyZffWwcxD8hq8k;
import o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM;
import o.r8lambdasr5bVOa2Di9thfD9WpM7Q9rULYM;
import o.r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4;
import o.r8lambdav9lEwuigriKPLoepmU9DzDAsGns;
import o.removeNodeAtDepth;
import o.requireParentFragment;
import o.setTransactionSuccessful;
import o.updateAdidI;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewViewModel$viewState$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int RatingCompat = 1;
    private static int serializer;
    public /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebViewViewModel$viewState$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(3, shortNewsContentCardView);
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r1 != 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r9 = ((java.lang.Boolean) r9).booleanValue();
        r1 = new com.roadrunner.web.presentation.WebViewViewModel$viewState$1((com.sentiance.core.model.thrift.O$b) r5, (o.ShortNewsContentCardView) r10, 3);
        r1.read = (o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM) r8;
        r1.IconCompatParcelizer = r9;
        r8 = r1.invokeSuspend(r4);
        r9 = com.roadrunner.web.presentation.WebViewViewModel$viewState$1.serializer + 45;
        com.roadrunner.web.presentation.WebViewViewModel$viewState$1.RatingCompat = r9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        r9 = ((java.lang.Boolean) r9).booleanValue();
        r1 = new com.roadrunner.web.presentation.WebViewViewModel$viewState$1((com.roadrunner.auth.data.SignInDataStore) r5, (o.ShortNewsContentCardView) r10, r0);
        r1.read = (o.AudioAttributesImplBaseParcelizer) r8;
        r1.IconCompatParcelizer = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        return r1.invokeSuspend(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r1 != 2) goto L13;
     */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.web.presentation.WebViewViewModel$viewState$1.RatingCompat
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.roadrunner.web.presentation.WebViewViewModel$viewState$1.serializer = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L20
            int r1 = r7.write
            o.createFromParcel r4 = o.createFromParcel.INSTANCE
            java.lang.Object r5 = r7.RemoteActionCompatParcelizer
            r6 = 94
            int r6 = r6 / r2
            if (r1 == 0) goto L8d
            if (r1 == r3) goto L6a
            if (r1 == r0) goto L50
            goto L2c
        L20:
            int r1 = r7.write
            o.createFromParcel r4 = o.createFromParcel.INSTANCE
            java.lang.Object r5 = r7.RemoteActionCompatParcelizer
            if (r1 == 0) goto L8d
            if (r1 == r3) goto L6a
            if (r1 == r0) goto L50
        L2c:
            o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM r8 = (o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM) r8
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            o.ShortNewsContentCardView r10 = (o.ShortNewsContentCardView) r10
            com.sentiance.core.model.thrift.O$b r5 = (com.sentiance.core.model.thrift.O$b) r5
            com.roadrunner.web.presentation.WebViewViewModel$viewState$1 r1 = new com.roadrunner.web.presentation.WebViewViewModel$viewState$1
            r2 = 3
            r1.<init>(r5, r10, r2)
            r1.read = r8
            r1.IconCompatParcelizer = r9
            java.lang.Object r8 = r1.invokeSuspend(r4)
            int r9 = com.roadrunner.web.presentation.WebViewViewModel$viewState$1.serializer
            int r9 = r9 + 45
            int r10 = r9 % 128
            com.roadrunner.web.presentation.WebViewViewModel$viewState$1.RatingCompat = r10
            int r9 = r9 % r0
            return r8
        L50:
            o.AudioAttributesImplBaseParcelizer r8 = (o.AudioAttributesImplBaseParcelizer) r8
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            o.ShortNewsContentCardView r10 = (o.ShortNewsContentCardView) r10
            com.roadrunner.auth.data.SignInDataStore r5 = (com.roadrunner.auth.data.SignInDataStore) r5
            com.roadrunner.web.presentation.WebViewViewModel$viewState$1 r1 = new com.roadrunner.web.presentation.WebViewViewModel$viewState$1
            r1.<init>(r5, r10, r0)
            r1.read = r8
            r1.IconCompatParcelizer = r9
            java.lang.Object r8 = r1.invokeSuspend(r4)
            return r8
        L6a:
            o.requireParentFragment r8 = (o.requireParentFragment) r8
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            o.ShortNewsContentCardView r10 = (o.ShortNewsContentCardView) r10
            o.performOptionsMenuClosed r5 = (o.performOptionsMenuClosed) r5
            com.roadrunner.web.presentation.WebViewViewModel$viewState$1 r1 = new com.roadrunner.web.presentation.WebViewViewModel$viewState$1
            r1.<init>(r5, r10, r3)
            r1.read = r8
            r1.IconCompatParcelizer = r9
            java.lang.Object r8 = r1.invokeSuspend(r4)
            int r9 = com.roadrunner.web.presentation.WebViewViewModel$viewState$1.RatingCompat
            int r9 = r9 + 97
            int r10 = r9 % 128
            com.roadrunner.web.presentation.WebViewViewModel$viewState$1.serializer = r10
            int r9 = r9 % r0
            return r8
        L8d:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            o.ShortNewsContentCardView r10 = (o.ShortNewsContentCardView) r10
            com.roadrunner.web.presentation.WebViewViewModel r5 = (com.roadrunner.web.presentation.WebViewViewModel) r5
            com.roadrunner.web.presentation.WebViewViewModel$viewState$1 r0 = new com.roadrunner.web.presentation.WebViewViewModel$viewState$1
            r0.<init>(r5, r10, r2)
            r0.read = r8
            r0.IconCompatParcelizer = r9
            java.lang.Object r8 = r0.invokeSuspend(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.web.presentation.WebViewViewModel$viewState$1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NavHostFragmentExternalSyntheticLambda1 navHostFragmentExternalSyntheticLambda1;
        r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4 r8lambdaf8vlmalrcdaejsafgssdyausxa4;
        String str;
        int i = 2 % 2;
        int i2 = this.write;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            String str2 = (String) this.read;
            boolean z = this.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            WebViewViewModel webViewViewModel = (WebViewViewModel) obj2;
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) webViewViewModel.serializer;
            firebaseRemoteConfigImpl.getClass();
            boolean zIconCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_SHOW_WEBVIEW_ERROR_OR_CONNECTION_LOST_PAGE_ENABLED);
            if (z || !zIconCompatParcelizer) {
                return str2 == null ? BrazeExternalSyntheticLambda99.write : new BrazeExternalSyntheticLambda96(str2);
            }
            return new BrazeExternalSyntheticLambda9(new fieldToInteger(webViewViewModel.IconCompatParcelizer.IconCompatParcelizer(R.string.network_connection_error_message), R.drawable.img_medium_brand_no_connection, null));
        }
        if (i2 == 1) {
            requireParentFragment requireparentfragment = (requireParentFragment) this.read;
            boolean z2 = this.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return performOptionsMenuClosed.read(requireparentfragment, z2);
        }
        if (i2 == 2) {
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (AudioAttributesImplBaseParcelizer) this.read;
            boolean z3 = this.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((n0) ((SignInDataStore) obj2).read).getClass();
            if (audioAttributesImplBaseParcelizer == null) {
                return absolutePath.read;
            }
            List<access000> list = audioAttributesImplBaseParcelizer.data.items;
            ArrayList arrayList = new ArrayList();
            for (access000 access000Var : list) {
                int i3 = RatingCompat + 41;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                String str3 = access000Var.type;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "close_button"}, getCieXyz.write())).booleanValue()) {
                    navHostFragmentExternalSyntheticLambda1 = NavHostFragment.read;
                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "edit_button"}, getCieXyz.write())).booleanValue()) {
                    NavHostFragmentExternalSyntheticLambda1 fragmentNavigatorExternalSyntheticLambda0 = new FragmentNavigatorExternalSyntheticLambda0(access000Var.url);
                    int i5 = RatingCompat + 61;
                    serializer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    navHostFragmentExternalSyntheticLambda1 = fragmentNavigatorExternalSyntheticLambda0;
                } else {
                    navHostFragmentExternalSyntheticLambda1 = null;
                }
                if (navHostFragmentExternalSyntheticLambda1 != null) {
                    int i7 = serializer + 49;
                    RatingCompat = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    arrayList.add(navHostFragmentExternalSyntheticLambda1);
                }
            }
            return new invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21(arrayList, z3);
        }
        r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM r8lambdakqbp11wz4zjrp1b2dhszxunsbm = (r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM) this.read;
        boolean z4 = this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        O$b o$b = (O$b) obj2;
        if (r8lambdakqbp11wz4zjrp1b2dhszxunsbm == null) {
            int i9 = RatingCompat + 41;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                ((getInputTextSuggestionStatedelegate) ((H$b) o$b.serializer).serializer).read.serializer.RemoteActionCompatParcelizer();
                throw null;
            }
            H$b h$b = (H$b) o$b.serializer;
            getTraversalIndexdelegate gettraversalindexdelegateRemoteActionCompatParcelizer = ((getInputTextSuggestionStatedelegate) h$b.serializer).read.serializer.RemoteActionCompatParcelizer();
            if (gettraversalindexdelegateRemoteActionCompatParcelizer != null) {
                int i10 = serializer + 77;
                RatingCompat = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                str = gettraversalindexdelegateRemoteActionCompatParcelizer.name;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            r8lambdaf8vlmalrcdaejsafgssdyausxa4 = new r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4(SQLite.read(new r8lambdasr5bVOa2Di9thfD9WpM7Q9rULYM(((setTransactionSuccessful) h$b.write).read(R.string.onboarding_bubble_title, str.concat(" 👋"))), new r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4(r8lambdav9lEwuigriKPLoepmU9DzDAsGns.STANDALONE_ITEM, null)), true);
        } else {
            GetAppStateImpl getAppStateImpl = (GetAppStateImpl) o$b.RemoteActionCompatParcelizer;
            getAppStateImpl.getClass();
            List list2 = r8lambdakqbp11wz4zjrp1b2dhszxunsbm.components;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((FormBody.Builder) getAppStateImpl.serializer).IconCompatParcelizer((r8lambdajbxBm0A7iJGxAyZffWwcxD8hq8k) it.next(), r8lambdav9lEwuigriKPLoepmU9DzDAsGns.STANDALONE_ITEM));
                int i12 = serializer + 33;
                RatingCompat = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            }
            r8lambdaf8vlmalrcdaejsafgssdyausxa4 = new r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4(removeNodeAtDepth.RemoteActionCompatParcelizer(onContentCardDismissed.IconCompatParcelizer(accessgetShouldMockNetworkRequestsAndDropEventscp.serializer, arrayList2)), false);
        }
        if (!z4) {
            return r8lambdaf8vlmalrcdaejsafgssdyausxa4;
        }
        o$b.getClass();
        List<r8lambdaemiioW_nKh79YyPl9R1HU3hWdFc> list3 = r8lambdaf8vlmalrcdaejsafgssdyausxa4.read;
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
        for (r8lambdaemiioW_nKh79YyPl9R1HU3hWdFc r8lambdav2dtvzqspfazpfmik0qxdnt7ag4 : list3) {
            if (r8lambdav2dtvzqspfazpfmik0qxdnt7ag4 instanceof r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4) {
                String strIconCompatParcelizer = ((setTransactionSuccessful) o$b.IconCompatParcelizer).IconCompatParcelizer(R.string.turn_by_turn_settings_new_tag);
                r8lambdav9lEwuigriKPLoepmU9DzDAsGns r8lambdav9lewuigrikploepmu9dzdasgns = ((r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4) r8lambdav2dtvzqspfazpfmik0qxdnt7ag4).RemoteActionCompatParcelizer;
                r8lambdav9lewuigrikploepmu9dzdasgns.getClass();
                r8lambdav2dtvzqspfazpfmik0qxdnt7ag4 = new r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4(r8lambdav9lewuigrikploepmu9dzdasgns, strIconCompatParcelizer);
            }
            arrayList3.add(r8lambdav2dtvzqspfazpfmik0qxdnt7ag4);
            int i14 = RatingCompat + 9;
            serializer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
        return new r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4(arrayList3, r8lambdaf8vlmalrcdaejsafgssdyausxa4.write);
    }
}
