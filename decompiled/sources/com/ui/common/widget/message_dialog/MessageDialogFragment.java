package com.ui.common.widget.message_dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.ui.common.base.BaseInjectionOverlayDialog;
import io.grpc.internal.SharedResourcePool;
import io.sentry.hints.MediaSessionCompatQueueItem;
import kotlin.LazyKt__LazyJVMKt;
import o.FocusListener;
import o.FwFClientbootstrapIfNeeded1;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.formatDateFromMillisdefault;
import o.getSUPPRESSannotations;
import o.getTimeFromEpochInSeconds;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAppSetIdReadingEnabled;
import o.isCircle;
import o.isValidTimeZone;
import o.nowInMilliseconds;
import o.nowInMillisecondsSystemClock;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class MessageDialogFragment extends BaseInjectionOverlayDialog {
    public int getNavigationEventDispatcher;
    public boolean initializeViewTreeOwners;
    public String invalidateMenu;
    public String onActivityResult;
    public boolean onBackPressed;
    public String onConfigurationChanged;
    public boolean onCreate;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY onCreatePanelMenu;
    public final ComponentRegistry$Builder onMenuItemSelected;
    public String onMultiWindowModeChanged;
    public String onNewIntent;

    public enum read {
        CLICKED_MAIN_BUTTON,
        CLICKED_SECONDARY_BUTTON,
        CLICKED_SKIP_BUTTON;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    public final getTimeFromEpochInSeconds serializer() {
        return (getTimeFromEpochInSeconds) this.onMenuItemSelected.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // com.ui.common.widget.OverlayDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.onMultiWindowModeChanged = arguments.getString("TITLE");
            this.invalidateMenu = arguments.getString("DESCRIPTION_BUNDLE");
            this.onActivityResult = arguments.getString("MAIN_ACTION_BUNDLE");
            this.onConfigurationChanged = arguments.getString("SECONDARY_ACTION_BUNDLE");
            this.onNewIntent = arguments.getString("SKIP_ACTION_BUNDLE");
            this.onCreate = arguments.getBoolean("SKIP", false);
            this.initializeViewTreeOwners = arguments.getBoolean("CANCELLABLE", true);
            this.onBackPressed = arguments.getBoolean("SHOULD_MAIN_ACTION_DISMISS", true);
            this.getNavigationEventDispatcher = arguments.getInt("BUTTON_BACKGROUND_COLOR", R.color.primary_button_background);
        }
        boolean z = this.initializeViewTreeOwners;
        ((DialogFragment) this).RemoteActionCompatParcelizer = z;
        Dialog dialog = ((DialogFragment) this).read;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
        this.getOnBackPressedDispatcher = Integer.valueOf(R.layout.fragment_dialog_message);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        SharedResourcePool sharedResourcePoolWrite = serializer().write();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePoolWrite.RemoteActionCompatParcelizer(viewLifecycleOwner, new TncContentKt$$ExternalSyntheticLambda2(29, this));
        TextView textView = (TextView) view.findViewById(R.id.tvTitle);
        textView.setText(this.onMultiWindowModeChanged);
        String str = this.onMultiWindowModeChanged;
        final int i = 0;
        textView.setVisibility((str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) ? 8 : 0);
        TextView textView2 = (TextView) view.findViewById(R.id.tvDescription);
        textView2.setText(this.invalidateMenu);
        String str2 = this.invalidateMenu;
        textView2.setVisibility((str2 == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) ? 8 : 0);
        final String tag = getTag();
        getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) view.findViewById(R.id.buttonMainAction);
        getsuppressannotations.setText(this.onActivityResult);
        String str3 = this.onActivityResult;
        getsuppressannotations.setVisibility((str3 == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) ? 8 : 0);
        getsuppressannotations.setBackgroundTintList(FocusListener.write(getsuppressannotations.getContext(), this.getNavigationEventDispatcher));
        getsuppressannotations.setOnClickListener(new View.OnClickListener(this) { // from class: com.ui.common.widget.message_dialog.MessageDialogFragment$$ExternalSyntheticLambda3
            public final /* synthetic */ MessageDialogFragment write;

            {
                this.write = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                String str4 = tag;
                MessageDialogFragment messageDialogFragment = this.write;
                if (i2 == 0) {
                    messageDialogFragment.IconCompatParcelizer(MessageDialogFragment.read.CLICKED_MAIN_BUTTON);
                    if (messageDialogFragment.onBackPressed) {
                        messageDialogFragment.serializer().RemoteActionCompatParcelizer();
                    }
                    messageDialogFragment.serializer().IconCompatParcelizer.serializer(new isValidTimeZone(str4));
                    return;
                }
                if (i2 == 1) {
                    messageDialogFragment.IconCompatParcelizer(MessageDialogFragment.read.CLICKED_SECONDARY_BUTTON);
                    messageDialogFragment.serializer().IconCompatParcelizer.serializer(new nowInMillisecondsSystemClock(str4));
                } else {
                    messageDialogFragment.IconCompatParcelizer(MessageDialogFragment.read.CLICKED_SKIP_BUTTON);
                    messageDialogFragment.serializer().IconCompatParcelizer.serializer(new nowInMilliseconds(str4));
                    messageDialogFragment.serializer().RemoteActionCompatParcelizer();
                }
            }
        });
        getSUPPRESSannotations getsuppressannotations2 = (getSUPPRESSannotations) view.findViewById(R.id.buttonSecondaryAction);
        getsuppressannotations2.setText(this.onConfigurationChanged);
        String str4 = this.onConfigurationChanged;
        getsuppressannotations2.setVisibility((str4 == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4)) ? 8 : 0);
        final int i2 = 1;
        getsuppressannotations2.setOnClickListener(new View.OnClickListener(this) { // from class: com.ui.common.widget.message_dialog.MessageDialogFragment$$ExternalSyntheticLambda3
            public final /* synthetic */ MessageDialogFragment write;

            {
                this.write = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                String str5 = tag;
                MessageDialogFragment messageDialogFragment = this.write;
                if (i3 == 0) {
                    messageDialogFragment.IconCompatParcelizer(MessageDialogFragment.read.CLICKED_MAIN_BUTTON);
                    if (messageDialogFragment.onBackPressed) {
                        messageDialogFragment.serializer().RemoteActionCompatParcelizer();
                    }
                    messageDialogFragment.serializer().IconCompatParcelizer.serializer(new isValidTimeZone(str5));
                    return;
                }
                if (i3 == 1) {
                    messageDialogFragment.IconCompatParcelizer(MessageDialogFragment.read.CLICKED_SECONDARY_BUTTON);
                    messageDialogFragment.serializer().IconCompatParcelizer.serializer(new nowInMillisecondsSystemClock(str5));
                } else {
                    messageDialogFragment.IconCompatParcelizer(MessageDialogFragment.read.CLICKED_SKIP_BUTTON);
                    messageDialogFragment.serializer().IconCompatParcelizer.serializer(new nowInMilliseconds(str5));
                    messageDialogFragment.serializer().RemoteActionCompatParcelizer();
                }
            }
        });
        getSUPPRESSannotations getsuppressannotations3 = (getSUPPRESSannotations) view.findViewById(R.id.buttonSkipAction);
        String string = this.onNewIntent;
        if (string == null) {
            string = getString(R.string.upload_receipt_retry_dialog_skip);
            string.getClass();
        }
        getsuppressannotations3.setText(string);
        getsuppressannotations3.setVisibility(this.onCreate ? 0 : 8);
        final int i3 = 2;
        getsuppressannotations3.setOnClickListener(new View.OnClickListener(this) { // from class: com.ui.common.widget.message_dialog.MessageDialogFragment$$ExternalSyntheticLambda3
            public final /* synthetic */ MessageDialogFragment write;

            {
                this.write = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i3;
                String str5 = tag;
                MessageDialogFragment messageDialogFragment = this.write;
                if (i4 == 0) {
                    messageDialogFragment.IconCompatParcelizer(MessageDialogFragment.read.CLICKED_MAIN_BUTTON);
                    if (messageDialogFragment.onBackPressed) {
                        messageDialogFragment.serializer().RemoteActionCompatParcelizer();
                    }
                    messageDialogFragment.serializer().IconCompatParcelizer.serializer(new isValidTimeZone(str5));
                    return;
                }
                if (i4 == 1) {
                    messageDialogFragment.IconCompatParcelizer(MessageDialogFragment.read.CLICKED_SECONDARY_BUTTON);
                    messageDialogFragment.serializer().IconCompatParcelizer.serializer(new nowInMillisecondsSystemClock(str5));
                } else {
                    messageDialogFragment.IconCompatParcelizer(MessageDialogFragment.read.CLICKED_SKIP_BUTTON);
                    messageDialogFragment.serializer().IconCompatParcelizer.serializer(new nowInMilliseconds(str5));
                    messageDialogFragment.serializer().RemoteActionCompatParcelizer();
                }
            }
        });
    }

    public final void IconCompatParcelizer(read readVar) {
        Object[] objArr = {new onViewAttachedToWindowlambda0[]{new onViewAttachedToWindowlambda0("TAG_CLICKED_BUTTON_RESULT", readVar)}};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        isCircle.serializer(this, "MESSAGE_DIALOG_FRAGMENT_TAG", (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320));
    }

    static {
        new MediaSessionCompatQueueItem((byte) 0, 15);
    }

    public MessageDialogFragment() {
        MessageDialogFragment$$ExternalSyntheticLambda0 messageDialogFragment$$ExternalSyntheticLambda0 = new MessageDialogFragment$$ExternalSyntheticLambda0(this, 0);
        MessageDialogFragment$$ExternalSyntheticLambda0 messageDialogFragment$$ExternalSyntheticLambda1 = new MessageDialogFragment$$ExternalSyntheticLambda0(this, 1);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new FwFClientbootstrapIfNeeded1(12, messageDialogFragment$$ExternalSyntheticLambda0));
        this.onMenuItemSelected = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(getTimeFromEpochInSeconds.class), new formatDateFromMillisdefault(onviewdetachedfromwindowlambda1Serializer, 0), messageDialogFragment$$ExternalSyntheticLambda1, new formatDateFromMillisdefault(onviewdetachedfromwindowlambda1Serializer, 1));
        this.onMultiWindowModeChanged = "";
        this.invalidateMenu = "";
        this.onActivityResult = "";
        this.onConfigurationChanged = "";
        this.onNewIntent = "";
        this.onCreate = true;
        this.initializeViewTreeOwners = true;
        this.getNavigationEventDispatcher = R.color.primary_button_background;
    }
}
