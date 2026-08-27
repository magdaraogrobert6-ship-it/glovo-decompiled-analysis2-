package o;

import com.roadrunner.liveness.recording.data.ChallengesRepository;
import com.roadrunner.liveness.recording.presentation.RecordingViewModel;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setFillColor implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ RecordingViewModel RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ setFillColor(RecordingViewModel recordingViewModel, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = recordingViewModel;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = write + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        RecordingViewModel recordingViewModel = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            getStyleTiuSbCo getstyletiusbco = (getStyleTiuSbCo) obj;
            getstyletiusbco.getClass();
            getFillColor getfillcolor = new getFillColor(getstyletiusbco, recordingViewModel, 0);
            int i4 = write + 17;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getfillcolor;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ((Boolean) obj).booleanValue();
                recordingViewModel.read(RoomDatabaseperformClear11.TIMER_PASSED, RoomDatabaseExternalSyntheticLambda2.FACE_DETECTION);
                return createfromparcel2;
            }
            Throwable th = (Throwable) obj;
            th.getClass();
            recordingViewModel.getClass();
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Problems with the camera: " + th, new Object[0]);
            recordingViewModel.read(RoomDatabaseperformClear11.CAMERA_ERROR, RoomDatabaseExternalSyntheticLambda2.FACE_DETECTION);
            return createfromparcel2;
        }
        if (!(!((Boolean) obj).booleanValue())) {
            int i6 = write + 79;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            setBackgroundColor setbackgroundcolor = recordingViewModel.read;
            int iWrite = (int) ((FirebaseRemoteConfigImpl) setbackgroundcolor.write).IconCompatParcelizer.write("liveness_movement_count");
            setbackgroundcolor.IconCompatParcelizer.getClass();
            r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U entries = RoomOpenHelperDelegate.getEntries();
            int iSerializer = getQueryParameterslambda2.serializer();
            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, iSerializer);
            for (int i8 = 0; i8 < iWrite; i8++) {
                displayInAppMessagelambda6 displayinappmessagelambda6 = displayInAppMessagelambda9.write;
                baseContentCardViewExternalSyntheticLambda0.add(entries.get(displayInAppMessagelambda9.serializer.RemoteActionCompatParcelizer(entries.size())));
            }
            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0Serializer = androidx.sqlite.SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
            ChallengesRepository challengesRepository = setbackgroundcolor.serializer;
            challengesRepository.getClass();
            baseContentCardViewExternalSyntheticLambda0Serializer.getClass();
            challengesRepository.serializer = baseContentCardViewExternalSyntheticLambda0Serializer;
            AtomicInteger atomicInteger = challengesRepository.IconCompatParcelizer;
            atomicInteger.set(0);
            challengesRepository.read.set(0);
            challengesRepository.write = (RoomOpenHelperDelegate) onContentCardDismissed.read(atomicInteger.get(), challengesRepository.serializer);
            recordingViewModel.RemoteActionCompatParcelizer(getGroupName.read);
        } else {
            recordingViewModel.read(RoomDatabaseperformClear11.CAMERA_ERROR, RoomDatabaseExternalSyntheticLambda2.FACE_DETECTION);
        }
        return createfromparcel2;
    }
}
