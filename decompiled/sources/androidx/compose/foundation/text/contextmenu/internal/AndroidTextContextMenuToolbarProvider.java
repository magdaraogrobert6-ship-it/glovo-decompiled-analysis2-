package androidx.compose.foundation.text.contextmenu.internal;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.CombinedModifiertoString1;
import o.ComposeUiFlags;
import o.any;
import o.awaitScrollDependencies;
import o.createFromParcel;
import o.foldIn;
import o.foldOut;
import o.getCieXyz;
import o.getFactory;
import o.getHighNSsRyOo;
import o.getInnerui;
import o.getOuterui;
import o.hashCodeimpl;
import o.materializeImpl;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setSpread;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidTextContextMenuToolbarProvider implements getHighNSsRyOo {
    public final View MediaDescriptionCompat;
    public WorkerKt$$ExternalSyntheticLambda2 MediaMetadataCompat;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public ActionMode read;
    public Runnable serializer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;
    public final awaitScrollDependencies IconCompatParcelizer = new awaitScrollDependencies();
    public final setSpread MediaBrowserCompatMediaItem = new setSpread(new ComposeUiFlags(this, 0));
    public final ComposeUiFlags RatingCompat = new ComposeUiFlags(this, 1);
    public final ComposeUiFlags MediaSessionCompatQueueItem = new ComposeUiFlags(this, 2);

    public final class TextActionModeCallbackImpl {
        public final CombinedModifiertoString1 IconCompatParcelizer;
        public final CombinedModifiertoString1 RemoteActionCompatParcelizer;
        public final View read;
        public final materializeImpl serializer;

        public TextActionModeCallbackImpl(materializeImpl materializeimpl, CombinedModifiertoString1 combinedModifiertoString1, CombinedModifiertoString1 combinedModifiertoString2, View view) {
            this.serializer = materializeimpl;
            this.IconCompatParcelizer = combinedModifiertoString1;
            this.RemoteActionCompatParcelizer = combinedModifiertoString2;
            this.read = view;
        }

        public final boolean updateMenuItems(Menu menu) {
            final int i;
            int i2;
            any anyVar = (any) this.IconCompatParcelizer.invoke();
            int i3 = 1803334089;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{anyVar, null}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            menu.clear();
            List list = anyVar.write;
            int size = list.size();
            int i4 = 0;
            int i5 = 1;
            int i6 = 1;
            while (i4 < size) {
                getInnerui getinnerui = (getInnerui) list.get(i4);
                if (getinnerui instanceof foldIn) {
                    int i7 = i5 + 1;
                    Object obj = getinnerui.serializer;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), i3, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, foldOut.serializer}, getCieXyz.write())).booleanValue()) {
                        i2 = R.id.cut;
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), i3, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, foldOut.write}, getCieXyz.write())).booleanValue()) {
                            i2 = R.id.copy;
                        } else {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), i3, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, foldOut.read}, getCieXyz.write())).booleanValue()) {
                                i2 = R.id.paste;
                            } else {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), i3, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, foldOut.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                                    i2 = R.id.selectAll;
                                } else {
                                    i2 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), i3, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, foldOut.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() ? R.id.autofill : i5;
                                }
                            }
                        }
                    }
                    final foldIn foldin = (foldIn) getinnerui;
                    MenuItem menuItemAdd = menu.add(i6, i2, i5, foldin.read);
                    menuItemAdd.setShowAsAction(2);
                    final int i8 = 1;
                    menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.materializeWithCompositionLocalInjectionInternal
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                            int i9 = i8;
                            Object obj2 = this;
                            Object obj3 = foldin;
                            if (i9 != 0) {
                                ((foldIn) obj3).IconCompatParcelizer.invoke(((androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl) obj2).serializer);
                                return true;
                            }
                            Context context = (Context) obj3;
                            TextClassification textClassification = (TextClassification) obj2;
                            String text = textClassification.getText();
                            PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                            if (Build.VERSION.SDK_INT >= 34) {
                                preferredFrameRate.read(activity);
                            } else {
                                activity.send();
                            }
                            return true;
                        }
                    });
                    i5 = i7;
                    i = 0;
                } else {
                    int i9 = 2;
                    if (getinnerui instanceof getFactory) {
                        int i10 = i5 + 1;
                        final Context context = this.read.getContext();
                        getFactory getfactory = (getFactory) getinnerui;
                        final TextClassification textClassification = getfactory.IconCompatParcelizer;
                        int i11 = getfactory.read;
                        if (i11 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i5, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(textClassification.getIcon());
                            i = 0;
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.materializeWithCompositionLocalInjectionInternal
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    int i12 = i;
                                    Object obj2 = textClassification;
                                    Object obj3 = context;
                                    if (i12 != 0) {
                                        ((foldIn) obj3).IconCompatParcelizer.invoke(((androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl) obj2).serializer);
                                        return true;
                                    }
                                    Context context2 = (Context) obj3;
                                    TextClassification textClassification2 = (TextClassification) obj2;
                                    String text = textClassification2.getText();
                                    PendingIntent activity = PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                    if (Build.VERSION.SDK_INT >= 34) {
                                        preferredFrameRate.read(activity);
                                    } else {
                                        activity.send();
                                    }
                                    return true;
                                }
                            });
                        } else {
                            i = 0;
                            boolean z = i11 == 0;
                            final RemoteAction remoteAction = textClassification.getActions().get(i11);
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, z ? 16908353 : 0, i5, remoteAction.getTitle());
                            if (!z) {
                                i9 = 0;
                            }
                            menuItemAdd3.setShowAsAction(i9);
                            if (z || remoteAction.shouldShowIcon()) {
                                menuItemAdd3.setIcon(remoteAction.getIcon().loadDrawable(context));
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.ComposedModifierKtmaterializeImpl1
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    PendingIntent actionIntent = remoteAction.getActionIntent();
                                    if (Build.VERSION.SDK_INT >= 34) {
                                        preferredFrameRate.read(actionIntent);
                                        return true;
                                    }
                                    actionIntent.send();
                                    return true;
                                }
                            });
                        }
                        i5 = i10;
                    } else {
                        i = 0;
                        if (getinnerui instanceof getOuterui) {
                            i6++;
                        }
                    }
                }
                i4++;
                i3 = 1803334089;
            }
            return true;
        }
    }

    public AndroidTextContextMenuToolbarProvider(View view, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.MediaDescriptionCompat = view;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.getHighNSsRyOo
    public final Object showTextContextMenu(hashCodeimpl hashcodeimpl, SuspendLambda suspendLambda) {
        Object objWrite = awaitScrollDependencies.write(this.IconCompatParcelizer, new AuthRepository$logoutUser$2(this, hashcodeimpl, null, 2), suspendLambda);
        return objWrite == CoroutineSingletons.COROUTINE_SUSPENDED ? objWrite : createFromParcel.INSTANCE;
    }
}
