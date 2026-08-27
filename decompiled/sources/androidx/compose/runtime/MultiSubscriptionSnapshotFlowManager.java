package androidx.compose.runtime;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import o.PlatformAutofillManager;
import o.PlatformAutofillManagerImpl;
import o.awaitLongPressOrCancellationrnUCldI;
import o.boundsUpdatesEventLoopui;
import o.getOffsetF1C5BW0;
import o.isAppSetIdReadingEnabled;
import o.logUnregisterActivitylambda1;
import o.notifyViewExited;
import o.onContentCardDismissed;
import o.onRemeasuredozmzZPI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4;
import o.relocationOffsetfbGrOKE;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class MultiSubscriptionSnapshotFlowManager extends boundsUpdatesEventLoopui {
    public final relocationOffsetfbGrOKE IconCompatParcelizer;
    public final onRemeasuredozmzZPI RemoteActionCompatParcelizer;
    public final onRemeasuredozmzZPI read;
    public final OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 serializer;
    public final ArrayList write;

    @Override // o.boundsUpdatesEventLoopui
    public final void IconCompatParcelizer() {
        this.serializer.IconCompatParcelizer();
        this.write.clear();
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        synchronized (this.MediaSessionCompatQueueItem) {
            this.read.IconCompatParcelizer();
        }
    }

    @Override // o.boundsUpdatesEventLoopui
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer(r8lambdahgODiqgPByAI8PyoNAxx8PBqX4 r8lambdahgodiqgpbyai8pyonaxx8pbqx4) {
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.RemoteActionCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM navigator$$ExternalSyntheticLambda1 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) onremeasuredozmzzpi.MediaBrowserCompatMediaItem(r8lambdahgodiqgpbyai8pyonaxx8pbqx4);
        if (navigator$$ExternalSyntheticLambda1 == null) {
            navigator$$ExternalSyntheticLambda1 = new Navigator$$ExternalSyntheticLambda1(this, 10, r8lambdahgodiqgpbyai8pyonaxx8pbqx4);
            int iWrite = onremeasuredozmzzpi.write(r8lambdahgodiqgpbyai8pyonaxx8pbqx4);
            if (iWrite < 0) {
                iWrite = ~iWrite;
            }
            Object[] objArr = onremeasuredozmzzpi.MediaMetadataCompat;
            Object obj = objArr[iWrite];
            onremeasuredozmzzpi.IconCompatParcelizer[iWrite] = r8lambdahgodiqgpbyai8pyonaxx8pbqx4;
            objArr[iWrite] = navigator$$ExternalSyntheticLambda1;
        }
        return navigator$$ExternalSyntheticLambda1;
    }

    @Override // o.boundsUpdatesEventLoopui
    public final void read() {
        synchronized (this.MediaSessionCompatQueueItem) {
            ArrayList arrayList = this.write;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                PlatformAutofillManagerImpl platformAutofillManagerImpl = (PlatformAutofillManagerImpl) arrayList.get(i);
                if (platformAutofillManagerImpl instanceof notifyViewExited) {
                    setNativeShader.serializer(this.read, ((notifyViewExited) platformAutofillManagerImpl).RemoteActionCompatParcelizer, ((notifyViewExited) platformAutofillManagerImpl).write);
                } else {
                    if (!(platformAutofillManagerImpl instanceof PlatformAutofillManager)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object[] objArr = {this.read, ((PlatformAutofillManager) platformAutofillManagerImpl).RemoteActionCompatParcelizer};
                    int iSerializer = isAppSetIdReadingEnabled.serializer();
                    setNativeShader.read(1496388782, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr, iSerializer, isAppSetIdReadingEnabled.serializer(), -1496388775);
                }
            }
        }
        this.write.clear();
    }

    @Override // o.boundsUpdatesEventLoopui
    public final void serializer(logUnregisterActivitylambda1 logunregisteractivitylambda1) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(logunregisteractivitylambda1);
        write(logunregisteractivitylambda1);
        read();
    }

    public final void write(Object obj, r8lambdahgODiqgPByAI8PyoNAxx8PBqX4 r8lambdahgodiqgpbyai8pyonaxx8pbqx4) {
        this.write.add(new notifyViewExited(obj, r8lambdahgodiqgpbyai8pyonaxx8pbqx4));
    }

    @Override // o.boundsUpdatesEventLoopui
    public final void write(r8lambdahgODiqgPByAI8PyoNAxx8PBqX4 r8lambdahgodiqgpbyai8pyonaxx8pbqx4) {
        this.write.add(new PlatformAutofillManager(r8lambdahgodiqgpbyai8pyonaxx8pbqx4));
    }

    public MultiSubscriptionSnapshotFlowManager() {
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        int iSerializer2 = isAppSetIdReadingEnabled.serializer();
        int iSerializer3 = isAppSetIdReadingEnabled.serializer();
        this.read = (onRemeasuredozmzZPI) setNativeShader.read(-795115599, isAppSetIdReadingEnabled.serializer(), iSerializer2, new Object[0], iSerializer, iSerializer3, 795115601);
        this.write = new ArrayList();
        relocationOffsetfbGrOKE relocationoffsetfbgroke = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
        this.IconCompatParcelizer = new relocationOffsetfbGrOKE();
        this.RemoteActionCompatParcelizer = new onRemeasuredozmzZPI();
        GapComposer$$ExternalSyntheticLambda3 gapComposer$$ExternalSyntheticLambda3 = new GapComposer$$ExternalSyntheticLambda3(8, this);
        getOffsetF1C5BW0.write(getOffsetF1C5BW0.RemoteActionCompatParcelizer);
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            getOffsetF1C5BW0.write = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getOffsetF1C5BW0.write, (Object) gapComposer$$ExternalSyntheticLambda3);
        }
        this.serializer = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(1, gapComposer$$ExternalSyntheticLambda3);
    }
}
