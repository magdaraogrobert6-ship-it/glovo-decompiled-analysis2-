package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.runtime.CompositionKt;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.DragAndDropTargetModifierNode;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessgetHighcp;
import o.awaitScrollDependencies;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getHighNSsRyOo;
import o.getPostalCode;
import o.hashCodeimpl;
import o.onShowTranslationui;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class BasicTextContextMenuProvider implements getHighNSsRyOo {
    public final DragAndDropTargetModifierNode write;
    public final awaitScrollDependencies read = new awaitScrollDependencies();
    public final PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(null);

    public final void RemoteActionCompatParcelizer(final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(723898654);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(this) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            accessgetHighcp accessgethighcp = (accessgetHighcp) ((onShowTranslationui) this.IconCompatParcelizer).getValue();
            if (accessgethighcp == null) {
                getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0(this) { // from class: o.equalsimpl
                        public final /* synthetic */ androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider IconCompatParcelizer;

                        {
                            this.IconCompatParcelizer = this;
                        }

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i6 = i;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                            androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider basicTextContextMenuProvider = this.IconCompatParcelizer;
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                            ((Integer) obj2).intValue();
                            if (i5 != 0) {
                                basicTextContextMenuProvider.RemoteActionCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i6 | 1));
                                return createfromparcel;
                            }
                            basicTextContextMenuProvider.RemoteActionCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i6 | 1));
                            return createfromparcel;
                        }
                    };
                    return;
                }
                return;
            }
            this.write.serializer(accessgethighcp, accessgethighcp.IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, Integer.valueOf((i2 << 6) & 896));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat2 = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat2 != null) {
            gethandleruiannotationsMediaDescriptionCompat2.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0(this) { // from class: o.equalsimpl
                public final /* synthetic */ androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = this;
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i6 = i;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                    androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider basicTextContextMenuProvider = this.IconCompatParcelizer;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    ((Integer) obj2).intValue();
                    if (i5 != 0) {
                        basicTextContextMenuProvider.RemoteActionCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i6 | 1));
                        return createfromparcel;
                    }
                    basicTextContextMenuProvider.RemoteActionCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i6 | 1));
                    return createfromparcel;
                }
            };
        }
    }

    @Override // o.getHighNSsRyOo
    public final Object showTextContextMenu(hashCodeimpl hashcodeimpl, SuspendLambda suspendLambda) {
        Object objWrite = awaitScrollDependencies.write(this.read, new AuthRepository$logoutUser$2(this, new accessgetHighcp(hashcodeimpl), null, 3), suspendLambda);
        return objWrite == CoroutineSingletons.COROUTINE_SUSPENDED ? objWrite : createFromParcel.INSTANCE;
    }

    public BasicTextContextMenuProvider(DragAndDropTargetModifierNode dragAndDropTargetModifierNode) {
        this.write = dragAndDropTargetModifierNode;
    }
}
