package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.settings.SessionsSettings;
import o.AndroidComposeViewRootModifierNodeonKeyEventfocusWasMovedOrCancelled1;
import o.TextAnnouncementContentCardView;
import o.accesssetInstancecp;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionFirelogPublisherImpl {
    public static final double IconCompatParcelizer = Math.random();
    public static final /* synthetic */ int serializer = 0;
    public final SessionsSettings MediaBrowserCompatMediaItem;
    public final accesssetInstancecp MediaMetadataCompat;
    public final TextAnnouncementContentCardView RemoteActionCompatParcelizer;
    public final AndroidComposeViewRootModifierNodeonKeyEventfocusWasMovedOrCancelled1 read;
    public final FirebaseApp write;

    public SessionFirelogPublisherImpl(FirebaseApp firebaseApp, accesssetInstancecp accesssetinstancecp, SessionsSettings sessionsSettings, AndroidComposeViewRootModifierNodeonKeyEventfocusWasMovedOrCancelled1 androidComposeViewRootModifierNodeonKeyEventfocusWasMovedOrCancelled1, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        firebaseApp.getClass();
        accesssetinstancecp.getClass();
        sessionsSettings.getClass();
        androidComposeViewRootModifierNodeonKeyEventfocusWasMovedOrCancelled1.getClass();
        textAnnouncementContentCardView.getClass();
        this.write = firebaseApp;
        this.MediaMetadataCompat = accesssetinstancecp;
        this.MediaBrowserCompatMediaItem = sessionsSettings;
        this.read = androidComposeViewRootModifierNodeonKeyEventfocusWasMovedOrCancelled1;
        this.RemoteActionCompatParcelizer = textAnnouncementContentCardView;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r6.updateSettings(r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$shouldLogSession(com.google.firebase.sessions.SessionFirelogPublisherImpl r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof o.AndroidComposeViewrequestFocusViewFocusFixaltFocus1
            if (r0 == 0) goto L13
            r0 = r6
            o.AndroidComposeViewrequestFocusViewFocusFixaltFocus1 r0 = (o.AndroidComposeViewrequestFocusViewFocusFixaltFocus1) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.read = r1
            goto L18
        L13:
            o.AndroidComposeViewrequestFocusViewFocusFixaltFocus1 r0 = new o.AndroidComposeViewrequestFocusViewFocusFixaltFocus1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.write
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.read
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            com.google.firebase.sessions.SessionFirelogPublisherImpl r5 = r0.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r6)
            goto L84
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r5)
            r5 = 0
            return r5
        L33:
            com.google.firebase.sessions.SessionFirelogPublisherImpl r5 = r0.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r6)
            goto L49
        L39:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r6)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r6 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.read
            r0.RemoteActionCompatParcelizer = r5
            r0.read = r4
            java.lang.Object r6 = r6.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r0)
            if (r6 != r1) goto L49
            goto L83
        L49:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Collection r6 = r6.values()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r2 = r6 instanceof java.util.Collection
            if (r2 == 0) goto L5f
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L5f
            goto Lb6
        L5f:
            java.util.Iterator r6 = r6.iterator()
        L63:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb6
            java.lang.Object r2 = r6.next()
            o.getDetachedFromParentLookaheadPlacement r2 = (o.getDetachedFromParentLookaheadPlacement) r2
            coil3.ComponentRegistry$Builder r2 = r2.serializer
            boolean r2 = r2.read()
            if (r2 == 0) goto L63
            com.google.firebase.sessions.settings.SessionsSettings r6 = r5.MediaBrowserCompatMediaItem
            r0.RemoteActionCompatParcelizer = r5
            r0.read = r3
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L84
        L83:
            return r1
        L84:
            com.google.firebase.sessions.settings.SessionsSettings r6 = r5.MediaBrowserCompatMediaItem
            o.boundsInScreen r0 = r6.serializer
            java.lang.Boolean r0 = r0.write()
            if (r0 == 0) goto L93
            boolean r6 = r0.booleanValue()
            goto L9f
        L93:
            o.boundsInScreen r6 = r6.RemoteActionCompatParcelizer
            java.lang.Boolean r6 = r6.write()
            if (r6 == 0) goto La4
            boolean r6 = r6.booleanValue()
        L9f:
            if (r6 != 0) goto La4
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        La4:
            com.google.firebase.sessions.settings.SessionsSettings r5 = r5.MediaBrowserCompatMediaItem
            double r5 = r5.RemoteActionCompatParcelizer()
            double r0 = com.google.firebase.sessions.SessionFirelogPublisherImpl.IconCompatParcelizer
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto Lb3
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        Lb3:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        Lb6:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.access$shouldLogSession(com.google.firebase.sessions.SessionFirelogPublisherImpl, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
