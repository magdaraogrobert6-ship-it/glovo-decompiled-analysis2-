package com.roadrunner.sidemenu.data.cache;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.perseus.PerseusEvent;
import com.deliveryhero.perseus.data.local.db.entity.HitEventFactory;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.getNone4e0Vf04;
import o.isRoot;
import o.performPause;

/* JADX INFO: loaded from: classes3.dex */
public final class SideMenuCacheImpl$get$$inlined$map$1 implements Flow {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Flow write;

    /* JADX INFO: renamed from: com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl$get$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        private static int MediaBrowserCompatMediaItem = 1;
        private static int RemoteActionCompatParcelizer;
        public final /* synthetic */ Object IconCompatParcelizer;
        public final /* synthetic */ Object read;
        public final /* synthetic */ int serializer;
        public final /* synthetic */ Object write;

        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, Object obj3, int i) {
            this.serializer = i;
            this.IconCompatParcelizer = obj;
            this.write = obj2;
            this.read = obj3;
        }

        /* JADX WARN: Code duplicated, block: B:119:0x0aaa  */
        /* JADX WARN: Code duplicated, block: B:128:0x0acf  */
        /* JADX WARN: Code duplicated, block: B:17:0x003b  */
        /* JADX WARN: Code duplicated, block: B:189:0x0c58  */
        /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:64:0x09a1  */
        /* JADX WARN: Code duplicated, block: B:73:0x09c3  */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x0a8d, code lost:
        
            if (r0.contains(r8.deliveryAction) != false) goto L113;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x0a96, code lost:
        
            if (r0.contains(r8.deliveryAction) != false) goto L113;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0a98, code lost:
        
            r13 = r1.IconCompatParcelizer;
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:0x0b40, code lost:
        
            if (r2.emit(r1, r0) == r3) goto L145;
         */
        /* JADX WARN: Code restructure failed: missing block: B:208:0x0cbc, code lost:
        
            if (r5.emit(r2, r0) == r3) goto L209;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r46, o.ShortNewsContentCardView r47) {
            /*
                Method dump skipped, instruction units count: 3284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl$get$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
        }
    }

    public /* synthetic */ SideMenuCacheImpl$get$$inlined$map$1(Flow flow, Object obj, Object obj2, int i) {
        this.serializer = i;
        this.write = flow;
        this.read = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 35;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.read;
        Flow flow = this.write;
        if (i3 == 0) {
            Object objCollect = flow.collect(new AnonymousClass2(flowCollector, (isRoot) obj2, (SideMenuCacheImpl) obj, 0), shortNewsContentCardView);
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return createfromparcel2;
            }
            int i4 = MediaDescriptionCompat + 37;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return objCollect;
            }
            throw null;
        }
        int i5 = 3;
        if (i3 == 1) {
            Object objCollect2 = ((FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3) flow).collect(new AnonymousClass2(flowCollector, (HitEventFactory) obj2, (PerseusEvent) obj, i5), shortNewsContentCardView);
            if (objCollect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return createfromparcel2;
            }
            int i6 = MediaDescriptionCompat + 13;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return objCollect2;
        }
        if (i3 == 2) {
            Object objCollect3 = flow.collect(new AnonymousClass2(flowCollector, (getNone4e0Vf04) obj2, (createInAppMessageEventSubscriber) obj, 4), shortNewsContentCardView);
            return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : createfromparcel2;
        }
        if (i3 != 3) {
            Object objCollect4 = ((FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1) flow).collect(new AnonymousClass2(flowCollector, (List) obj2, (List) obj, 6), shortNewsContentCardView);
            return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : createfromparcel2;
        }
        Object objCollect5 = ((FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1) flow).collect(new AnonymousClass2(flowCollector, (getContentViewGroupParentLayout) obj2, (performPause) obj, 5), shortNewsContentCardView);
        return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : createfromparcel2;
    }
}
