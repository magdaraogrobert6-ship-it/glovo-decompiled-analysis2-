package com.roadrunner.login.data.forgotpassword;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.createInAppMessageViewlambda1;
import o.getAppropriateFullView;
import o.getCieXyz;
import o.getInAppMessageManager;
import o.getPendingTablesruntime;
import o.getPostRollbackHooksruntime;
import o.onCloseActionlambda1;
import o.onCloseClicked;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ForgotPasswordRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    private final getPendingTablesruntime user;

    public static final class Companion {
        private static int read = 0;
        private static int serializer = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 41;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                serializer serializerVar = serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            serializer serializerVar2 = serializer.INSTANCE;
            int i3 = read + 53;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return serializerVar2;
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class serializer implements getInAppMessageManager {
        public static final int $stable;
        public static final serializer INSTANCE;
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;
        private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
        private static int serializer = 0;
        private static int write = 1;

        private serializer() {
        }

        static {
            serializer serializerVar = new serializer();
            INSTANCE = serializerVar;
            onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.login.data.forgotpassword.ForgotPasswordRequest", serializerVar, 1);
            oncloseactionlambda1.read(FeedbackEvent.UI, false);
            descriptor = oncloseactionlambda1;
            $stable = 8;
            int i = write + 117;
            serializer = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        @Override // o.setGraphicModalMaxWidthDp
        public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = i2 + 105;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            int i4 = i2 + 113;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return r8lambda92m0p9sit5uf70mvjf4rwmruda;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.getInAppMessageManager
        public setGraphicModalMaxWidthDp[] typeParametersSerializers() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 15;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = performClickAction.IconCompatParcelizer;
                throw null;
            }
            setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr2 = performClickAction.IconCompatParcelizer;
            int i3 = IconCompatParcelizer + 109;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return setgraphicmodalmaxwidthdpArr2;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.getInAppMessageManager
        public final setGraphicModalMaxWidthDp[] childSerializers() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 5;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {getPostRollbackHooksruntime.write};
            int i4 = RemoteActionCompatParcelizer + 63;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdpArr;
        }

        public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, ForgotPasswordRequest forgotPasswordRequest) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 113;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            defaultInAppMessageViewWrapperFactory.getClass();
            forgotPasswordRequest.getClass();
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            ForgotPasswordRequest.write$Self$implementation(forgotPasswordRequest, defaultInAppMessageSlideupViewFactorySerializer, r8lambda92m0p9sit5uf70mvjf4rwmruda);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            int i4 = RemoteActionCompatParcelizer + 5;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 66 / 0;
            }
        }

        @Override // o.setGraphicModalMaxWidthDp
        public /* bridge */ /* synthetic */ void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 71;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            serialize(defaultInAppMessageViewWrapperFactory, (ForgotPasswordRequest) obj);
            int i4 = IconCompatParcelizer + 59;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004f  */
        /* JADX WARN: Code duplicated, block: B:27:0x005a A[SYNTHETIC] */
        @Override // o.setGraphicModalMaxWidthDp
        public final ForgotPasswordRequest deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
            createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
            boolean z;
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = IconCompatParcelizer + 99;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                defaultInAppMessageModalViewFactoryCompanion.getClass();
                r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
                createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                createinappmessageviewlambda1Serializer.getClass();
                i = 1;
                z = false;
            } else {
                defaultInAppMessageModalViewFactoryCompanion.getClass();
                r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
                createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                createinappmessageviewlambda1Serializer.getClass();
                z = true;
                i = 0;
            }
            onCloseClicked oncloseclicked = null;
            getPendingTablesruntime getpendingtablesruntime = null;
            while (z) {
                int i5 = IconCompatParcelizer + 55;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    i2 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                    int i6 = 23 / 0;
                    if (i2 == -1) {
                        z = false;
                    } else {
                        if (i2 == 0) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                            return null;
                        }
                        getpendingtablesruntime = (getPendingTablesruntime) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, getPostRollbackHooksruntime.write, getpendingtablesruntime);
                        i = 1;
                    }
                } else {
                    i2 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                    if (i2 == -1) {
                        z = false;
                    } else {
                        if (i2 == 0) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                            return null;
                        }
                        getpendingtablesruntime = (getPendingTablesruntime) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, getPostRollbackHooksruntime.write, getpendingtablesruntime);
                        i = 1;
                    }
                }
            }
            createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            return new ForgotPasswordRequest(i, getpendingtablesruntime, oncloseclicked);
        }

        @Override // o.setGraphicModalMaxWidthDp
        public /* bridge */ /* synthetic */ Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 7;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ForgotPasswordRequest forgotPasswordRequestDeserialize = deserialize(defaultInAppMessageModalViewFactoryCompanion);
            int i4 = RemoteActionCompatParcelizer + 21;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return forgotPasswordRequestDeserialize;
            }
            throw null;
        }
    }

    @getAppropriateFullView(serializer = FeedbackEvent.UI)
    public static /* synthetic */ void getUser$annotations() {
        int i = 2 % 2;
        int i2 = read + 45;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getPendingTablesruntime component1() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 51;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getPendingTablesruntime getpendingtablesruntime = this.user;
        int i5 = i2 + 25;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getpendingtablesruntime;
    }

    public final getPendingTablesruntime getUser() {
        int i = 2 % 2;
        int i2 = read + 69;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.user;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = write + 55;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ ForgotPasswordRequest(int i, getPendingTablesruntime getpendingtablesruntime, onCloseClicked oncloseclicked) {
        if (1 == (i & 1)) {
            this.user = getpendingtablesruntime;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        read = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.user.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.user.hashCode();
        int i3 = RemoteActionCompatParcelizer + 33;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public static final /* synthetic */ void write$Self$implementation(ForgotPasswordRequest forgotPasswordRequest, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, getPostRollbackHooksruntime.write, forgotPasswordRequest.user);
        int i4 = RemoteActionCompatParcelizer + 69;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final ForgotPasswordRequest copy(getPendingTablesruntime getpendingtablesruntime) {
        int i = 2 % 2;
        getpendingtablesruntime.getClass();
        ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest(getpendingtablesruntime);
        int i2 = read + 13;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return forgotPasswordRequest;
    }

    public static /* synthetic */ ForgotPasswordRequest copy$default(ForgotPasswordRequest forgotPasswordRequest, getPendingTablesruntime getpendingtablesruntime, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = read + 51;
            int i4 = i3 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i4;
            int i5 = i3 % 2;
            getpendingtablesruntime = forgotPasswordRequest.user;
            int i6 = i4 + 111;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return forgotPasswordRequest.copy(getpendingtablesruntime);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ForgotPasswordRequest(user=" + this.user + ")";
        int i2 = read + 77;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ForgotPasswordRequest(getPendingTablesruntime getpendingtablesruntime) {
        getpendingtablesruntime.getClass();
        this.user = getpendingtablesruntime;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForgotPasswordRequest) {
            Object[] objArr = {this.user, ((ForgotPasswordRequest) obj).user};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = read + 51;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 63;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
