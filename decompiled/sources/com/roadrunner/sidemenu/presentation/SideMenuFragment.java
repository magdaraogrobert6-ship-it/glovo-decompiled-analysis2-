package com.roadrunner.sidemenu.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.sentiance.core.model.events.N$b;
import com.ui.common.base.BaseInjectionFragment;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.getPowersOfTen;
import o.getQueryContext;
import o.isDigit;
import o.obtainTint8_81llA;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk;
import o.r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class SideMenuFragment extends BaseInjectionFragment implements obtainTint8_81llA {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public N$b RemoteActionCompatParcelizer;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY read;
    public r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM serializer;
    public final ComponentRegistry$Builder write;

    public SideMenuFragment() {
        super(0);
        RealWebSocket$$ExternalSyntheticLambda0 realWebSocket$$ExternalSyntheticLambda0 = new RealWebSocket$$ExternalSyntheticLambda0(8, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(26, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(25, this)));
        this.write = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(SideMenuViewModel.class), new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 14), realWebSocket$$ExternalSyntheticLambda0, new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 15));
    }

    @Override // o.obtainTint8_81llA
    public final getPowersOfTen read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 89;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            isDigit isdigit = isDigit.write;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        isDigit isdigit2 = isDigit.write;
        int i3 = IconCompatParcelizer + 57;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return isdigit2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        getQueryContext getquerycontextWrite = ((SideMenuViewModel) this.write.MediaSessionCompatResultReceiverWrapper()).write();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        getquerycontextWrite.IconCompatParcelizer(viewLifecycleOwner, new JobKt__JobKt$invokeOnCompletion$1(this));
        int i2 = MediaDescriptionCompat + 41;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(22, this), true, 953723345)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = IconCompatParcelizer + 109;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return composeView;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
    
        if ((r10 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
    
        r9 = r9.serializer;
        r10 = 66 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        if (r9 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
    
        r9 = r9.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
    
        if (r9 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
    
        r9.IconCompatParcelizer.write(o.r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug.HIDE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        o.removeNodeAtDepth.serializer("sideMenuNavigator");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        if ((r10 instanceof o.accessgetShouldRequestFrameworkListenToNetworkUpdatescp) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        r10 = (o.accessgetShouldRequestFrameworkListenToNetworkUpdatescp) r10;
        coil3.ExtrasKt.write(r9, java.lang.Boolean.valueOf(r10.RemoteActionCompatParcelizer()));
        r6 = new java.lang.Object[]{r9, java.lang.Boolean.valueOf(r10.RemoteActionCompatParcelizer())};
        coil3.ExtrasKt.read(662558831, o.handleUrlOverridelambda1.RemoteActionCompatParcelizer(), o.handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -662558827, o.handleUrlOverridelambda1.RemoteActionCompatParcelizer(), o.handleUrlOverridelambda1.RemoteActionCompatParcelizer(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c9, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r10, o.accessgetStaticExternalIEventMessengercp.IconCompatParcelizer}, o.getCieXyz.write())).booleanValue()) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r10, o.accessgetStaticExternalIEventMessengercp.IconCompatParcelizer}, o.getCieXyz.write())).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:
    
        r10 = com.roadrunner.sidemenu.presentation.SideMenuFragment.IconCompatParcelizer + 39;
        com.roadrunner.sidemenu.presentation.SideMenuFragment.MediaDescriptionCompat = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write(com.roadrunner.sidemenu.presentation.SideMenuFragment r9, o.accessgetPendingConfigurationscp r10) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.sidemenu.presentation.SideMenuFragment.write(com.roadrunner.sidemenu.presentation.SideMenuFragment, o.accessgetPendingConfigurationscp):void");
    }
}
