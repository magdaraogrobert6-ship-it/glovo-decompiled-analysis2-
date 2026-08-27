package androidx.compose.ui.platform;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import o.AndroidContentCaptureManagerCompanion;
import o.ContentType_androidKt;
import o.DragAndDropNodeKtDragAndDropModifierNode1;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardNumber;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPersonFullName;
import o.getPhoneNumber;
import o.getPostalCode;
import o.hideTranslatedText;
import o.onContentCardDismissed;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes.dex */
public final class CompositionLocalsKt {
    private static final ProvidableCompositionLocal LocalAccessibilityManager = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAccessibilityManager$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final AccessibilityManager invoke() {
            return null;
        }
    });
    private static final ProvidableCompositionLocal LocalAutofill = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofill$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Autofill invoke() {
            return null;
        }
    });
    private static final ProvidableCompositionLocal LocalAutofillTree = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillTree$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final AutofillTree invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalAutofillTree");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalAutofillManager = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillManager$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final AutofillManager invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalAutofillManager");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalClipboardManager = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final ClipboardManager invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalClipboardManager");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalClipboard = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboard$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Clipboard invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalClipboard");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalGraphicsContext = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalGraphicsContext$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final GraphicsContext invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalGraphicsContext");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalDensity = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalDensity$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Density invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalDensity");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalFocusManager = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final FocusManager invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalFocusManager");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalFontLoader = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Font.ResourceLoader invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalFontLoader");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalFontFamilyResolver = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontFamilyResolver$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final FontFamily.Resolver invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalFontFamilyResolver");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalHapticFeedback = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalHapticFeedback$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final HapticFeedback invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalHapticFeedback");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalInputModeManager = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final InputModeManager invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalInputManager");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalLayoutDirection = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLayoutDirection$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final LayoutDirection invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalLayoutDirection");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalProvidableLocaleList = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalProvidableLocaleList$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final LocaleList invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalProvidableLocaleList");
            throw new KotlinNothingValueException();
        }
    });
    private static final getNewPassword LocalLocale = new getPhoneNumber(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLocale$1
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Locale invoke(getCreditCardNumber getcreditcardnumber) {
            getNewPassword localLocaleList = CompositionLocalsKt.getLocalLocaleList();
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1 = (DragAndDropNodestartDragAndDropTransfer1) getcreditcardnumber;
            dragAndDropNodestartDragAndDropTransfer1.getClass();
            return (Locale) onContentCardDismissed.IconCompatParcelizer((Iterable) getPersonFullName.write(dragAndDropNodestartDragAndDropTransfer1, localLocaleList));
        }
    });
    private static final ProvidableCompositionLocal LocalTextInputService = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextInputService$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final TextInputService invoke() {
            return null;
        }
    });
    private static final ProvidableCompositionLocal LocalSoftwareKeyboardController = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalSoftwareKeyboardController$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final SoftwareKeyboardController invoke() {
            return null;
        }
    });
    private static final ProvidableCompositionLocal LocalTextToolbar = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextToolbar$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final TextToolbar invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalTextToolbar");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalUriHandler = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalUriHandler$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final UriHandler invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalUriHandler");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalViewConfiguration = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalViewConfiguration$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final ViewConfiguration invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalViewConfiguration");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalWindowInfo = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalWindowInfo$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final WindowInfo invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalWindowInfo");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalPointerIconService = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalPointerIconService$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final PointerIconService invoke() {
            return null;
        }
    });
    private static final ProvidableCompositionLocal LocalProvidableScrollCaptureInProgress = new getPhoneNumber(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });
    private static final ProvidableCompositionLocal LocalCursorBlinkEnabled = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalCursorBlinkEnabled$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });

    public static final ProvidableCompositionLocal getLocalAccessibilityManager() {
        return LocalAccessibilityManager;
    }

    public static final ProvidableCompositionLocal getLocalAutofill() {
        return LocalAutofill;
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getLocalAutofill$annotations() {
    }

    public static final ProvidableCompositionLocal getLocalAutofillManager() {
        return LocalAutofillManager;
    }

    public static final ProvidableCompositionLocal getLocalAutofillTree() {
        return LocalAutofillTree;
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getLocalAutofillTree$annotations() {
    }

    public static final ProvidableCompositionLocal getLocalClipboard() {
        return LocalClipboard;
    }

    public static final ProvidableCompositionLocal getLocalClipboardManager() {
        return LocalClipboardManager;
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getLocalClipboardManager$annotations() {
    }

    public static final ProvidableCompositionLocal getLocalCursorBlinkEnabled() {
        return LocalCursorBlinkEnabled;
    }

    public static final ProvidableCompositionLocal getLocalDensity() {
        return LocalDensity;
    }

    public static final ProvidableCompositionLocal getLocalFocusManager() {
        return LocalFocusManager;
    }

    public static final ProvidableCompositionLocal getLocalFontFamilyResolver() {
        return LocalFontFamilyResolver;
    }

    public static final ProvidableCompositionLocal getLocalFontLoader() {
        return LocalFontLoader;
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getLocalFontLoader$annotations() {
    }

    public static final ProvidableCompositionLocal getLocalGraphicsContext() {
        return LocalGraphicsContext;
    }

    public static final ProvidableCompositionLocal getLocalHapticFeedback() {
        return LocalHapticFeedback;
    }

    public static final ProvidableCompositionLocal getLocalInputModeManager() {
        return LocalInputModeManager;
    }

    public static final ProvidableCompositionLocal getLocalLayoutDirection() {
        return LocalLayoutDirection;
    }

    public static final getNewPassword getLocalLocale() {
        return LocalLocale;
    }

    public static final getNewPassword getLocalLocaleList() {
        return LocalProvidableLocaleList;
    }

    public static final ProvidableCompositionLocal getLocalPointerIconService() {
        return LocalPointerIconService;
    }

    public static final ProvidableCompositionLocal getLocalProvidableLocaleList() {
        return LocalProvidableLocaleList;
    }

    public static final ProvidableCompositionLocal getLocalProvidableScrollCaptureInProgress() {
        return LocalProvidableScrollCaptureInProgress;
    }

    public static final getNewPassword getLocalScrollCaptureInProgress() {
        return LocalProvidableScrollCaptureInProgress;
    }

    public static final ProvidableCompositionLocal getLocalSoftwareKeyboardController() {
        return LocalSoftwareKeyboardController;
    }

    public static final ProvidableCompositionLocal getLocalTextInputService() {
        return LocalTextInputService;
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getLocalTextInputService$annotations() {
    }

    public static final ProvidableCompositionLocal getLocalTextToolbar() {
        return LocalTextToolbar;
    }

    public static final ProvidableCompositionLocal getLocalUriHandler() {
        return LocalUriHandler;
    }

    public static final ProvidableCompositionLocal getLocalViewConfiguration() {
        return LocalViewConfiguration;
    }

    public static final ProvidableCompositionLocal getLocalWindowInfo() {
        return LocalWindowInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @ExperimentalComposeUiApi
    public static final void ProvideCommonCompositionLocals(final Owner owner, final UriHandler uriHandler, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean zIconCompatParcelizer;
        boolean zIconCompatParcelizer2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1925803616);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer2 = getpostalcode.read(owner);
            } else {
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(owner);
            }
            i2 = (zIconCompatParcelizer2 ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                zIconCompatParcelizer = getpostalcode.read(uriHandler);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(uriHandler);
            }
            i2 |= zIconCompatParcelizer ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            hideTranslatedText hidetranslatedtextWrite = LocalAccessibilityManager.write(owner.getAccessibilityManager());
            hideTranslatedText hidetranslatedtextWrite2 = LocalAutofill.write(owner.getAutofill());
            hideTranslatedText hidetranslatedtextWrite3 = LocalAutofillManager.write(owner.getAutofillManager());
            hideTranslatedText hidetranslatedtextWrite4 = LocalAutofillTree.write(owner.getAutofillTree());
            hideTranslatedText hidetranslatedtextWrite5 = LocalClipboardManager.write(owner.getClipboardManager());
            hideTranslatedText hidetranslatedtextWrite6 = LocalClipboard.write(owner.getClipboard());
            hideTranslatedText hidetranslatedtextWrite7 = LocalDensity.write(owner.getDensity());
            hideTranslatedText hidetranslatedtextWrite8 = LocalFocusManager.write(owner.getFocusOwner());
            hideTranslatedText hidetranslatedtextWrite9 = LocalFontLoader.write(owner.getFontLoader());
            hidetranslatedtextWrite9.write = false;
            hideTranslatedText hidetranslatedtextWrite10 = LocalFontFamilyResolver.write(owner.getFontFamilyResolver());
            hidetranslatedtextWrite10.write = false;
            AndroidContentCaptureManagerCompanion.IconCompatParcelizer(new hideTranslatedText[]{hidetranslatedtextWrite, hidetranslatedtextWrite2, hidetranslatedtextWrite3, hidetranslatedtextWrite4, hidetranslatedtextWrite5, hidetranslatedtextWrite6, hidetranslatedtextWrite7, hidetranslatedtextWrite8, hidetranslatedtextWrite9, hidetranslatedtextWrite10, LocalHapticFeedback.write(owner.getHapticFeedBack()), LocalInputModeManager.write(owner.getInputModeManager()), LocalLayoutDirection.write(owner.getLayoutDirection()), LocalTextInputService.write(owner.getTextInputService()), LocalSoftwareKeyboardController.write(owner.getSoftwareKeyboardController()), LocalTextToolbar.write(owner.getTextToolbar()), LocalUriHandler.write(uriHandler), LocalViewConfiguration.write(owner.getViewConfiguration()), LocalWindowInfo.write(owner.getWindowInfo()), LocalPointerIconService.write(owner.getPointerIconService()), LocalGraphicsContext.write(owner.getGraphicsContext()), DragAndDropNodeKtDragAndDropModifierNode1.RemoteActionCompatParcelizer.write(owner.getRetainedValuesStore()), LocalProvidableLocaleList.write(owner.getLocaleList())}, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, ((i2 >> 3) & 112) | 8);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.platform.CompositionLocalsKt.ProvideCommonCompositionLocals.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i3) {
                    CompositionLocalsKt.ProvideCommonCompositionLocals(owner, uriHandler, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
