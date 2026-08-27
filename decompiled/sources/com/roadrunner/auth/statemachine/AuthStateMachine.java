package com.roadrunner.auth.statemachine;

import androidx.compose.ui.graphics.Fields;
import java.util.Map;
import java.util.Set;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.isMainThread;
import o.onContentCardClicked;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.setEmailNotificationSubscriptionTypelambda1;
import o.setInputTextSuggestionState;
import o.setLiveRegionhR3wRGc;
import o.setSelection;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthStateMachine {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public final MutableStateFlow IconCompatParcelizer;
    public final isMainThread RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final Map write;

    public AuthStateMachine(isMainThread ismainthread) {
        this.RemoteActionCompatParcelizer = ismainthread;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(setLiveRegionhR3wRGc.read);
        this.IconCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
        setSelection setselection = setSelection.INITIAL;
        setSelection setselection2 = setSelection.NOT_LOGGED_IN;
        setSelection setselection3 = setSelection.LOGGED_IN;
        setSelection setselection4 = setSelection.LOGOUT_REQUESTED;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(setselection, onContentCardClicked.MediaSessionCompatQueueItem(new setSelection[]{setselection2, setselection3, setselection4}));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0(setselection2, onContentCardClicked.MediaSessionCompatQueueItem(new setSelection[]{setselection3, setselection4, setselection2}));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0(setselection3, onContentCardClicked.MediaSessionCompatQueueItem(new setSelection[]{setselection4, setselection3}));
        setSelection setselection5 = setSelection.LOGOUT_STARTED;
        this.write = onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, onviewattachedtowindowlambda2, new onViewAttachedToWindowlambda0(setselection4, RangesKt.write(setselection5)), new onViewAttachedToWindowlambda0(setselection5, RangesKt.write(setselection2)));
    }

    public final void write(setEmailNotificationSubscriptionTypelambda1 setemailnotificationsubscriptiontypelambda1) {
        Object obj;
        synchronized (this) {
            setemailnotificationsubscriptiontypelambda1.getClass();
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.IconCompatParcelizer("Requesting action: " + ((setSelection) setemailnotificationsubscriptiontypelambda1.IconCompatParcelizer) + " from state: " + ((setInputTextSuggestionState) this.IconCompatParcelizer.read()).RemoteActionCompatParcelizer.name() + " when " + setemailnotificationsubscriptiontypelambda1.write(), new Object[0]);
            setSelection setselection = ((setInputTextSuggestionState) this.IconCompatParcelizer.read()).RemoteActionCompatParcelizer;
            setSelection setselection2 = (setSelection) setemailnotificationsubscriptiontypelambda1.IconCompatParcelizer;
            Set set = (Set) this.write.get(setselection);
            if (set != null && set.contains(setselection2)) {
                setInputTextSuggestionState setinputtextsuggestionstate = this.RemoteActionCompatParcelizer.read(setemailnotificationsubscriptiontypelambda1);
                MutableStateFlow mutableStateFlow = this.IconCompatParcelizer;
                do {
                    obj = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, setinputtextsuggestionstate));
            } else {
                forest.write(new InvalidAuthTransitionException("Failed to change auth state machine.Attempted to use transition: " + ((setSelection) setemailnotificationsubscriptiontypelambda1.IconCompatParcelizer) + " from state: " + ((setInputTextSuggestionState) this.IconCompatParcelizer.read()).RemoteActionCompatParcelizer.name() + " in " + setemailnotificationsubscriptiontypelambda1.write() + " "));
            }
        }
    }

    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 31;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MutableStateFlow mutableStateFlow = this.IconCompatParcelizer;
        if (((setInputTextSuggestionState) mutableStateFlow.read()).RemoteActionCompatParcelizer == setSelection.LOGOUT_REQUESTED) {
            return true;
        }
        int i4 = MediaDescriptionCompat + 35;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return ((setInputTextSuggestionState) mutableStateFlow.read()).RemoteActionCompatParcelizer == setSelection.LOGOUT_STARTED;
    }
}
