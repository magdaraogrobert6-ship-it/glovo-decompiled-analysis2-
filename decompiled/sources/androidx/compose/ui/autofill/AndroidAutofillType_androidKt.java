package androidx.compose.ui.autofill;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.HashMap;
import o.onMove;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidAutofillType_androidKt {
    private static final HashMap<AutofillType, String> androidAutofillTypes = onMove.serializer(new onViewAttachedToWindowlambda0(AutofillType.EmailAddress, "emailAddress"), new onViewAttachedToWindowlambda0(AutofillType.Username, "username"), new onViewAttachedToWindowlambda0(AutofillType.Password, "password"), new onViewAttachedToWindowlambda0(AutofillType.NewUsername, "newUsername"), new onViewAttachedToWindowlambda0(AutofillType.NewPassword, "newPassword"), new onViewAttachedToWindowlambda0(AutofillType.PostalAddress, "postalAddress"), new onViewAttachedToWindowlambda0(AutofillType.PostalCode, "postalCode"), new onViewAttachedToWindowlambda0(AutofillType.CreditCardNumber, "creditCardNumber"), new onViewAttachedToWindowlambda0(AutofillType.CreditCardSecurityCode, "creditCardSecurityCode"), new onViewAttachedToWindowlambda0(AutofillType.CreditCardExpirationDate, "creditCardExpirationDate"), new onViewAttachedToWindowlambda0(AutofillType.CreditCardExpirationMonth, "creditCardExpirationMonth"), new onViewAttachedToWindowlambda0(AutofillType.CreditCardExpirationYear, "creditCardExpirationYear"), new onViewAttachedToWindowlambda0(AutofillType.CreditCardExpirationDay, "creditCardExpirationDay"), new onViewAttachedToWindowlambda0(AutofillType.AddressCountry, "addressCountry"), new onViewAttachedToWindowlambda0(AutofillType.AddressRegion, "addressRegion"), new onViewAttachedToWindowlambda0(AutofillType.AddressLocality, "addressLocality"), new onViewAttachedToWindowlambda0(AutofillType.AddressStreet, "streetAddress"), new onViewAttachedToWindowlambda0(AutofillType.AddressAuxiliaryDetails, "extendedAddress"), new onViewAttachedToWindowlambda0(AutofillType.PostalCodeExtended, "extendedPostalCode"), new onViewAttachedToWindowlambda0(AutofillType.PersonFullName, "personName"), new onViewAttachedToWindowlambda0(AutofillType.PersonFirstName, "personGivenName"), new onViewAttachedToWindowlambda0(AutofillType.PersonLastName, "personFamilyName"), new onViewAttachedToWindowlambda0(AutofillType.PersonMiddleName, "personMiddleName"), new onViewAttachedToWindowlambda0(AutofillType.PersonMiddleInitial, "personMiddleInitial"), new onViewAttachedToWindowlambda0(AutofillType.PersonNamePrefix, "personNamePrefix"), new onViewAttachedToWindowlambda0(AutofillType.PersonNameSuffix, "personNameSuffix"), new onViewAttachedToWindowlambda0(AutofillType.PhoneNumber, "phoneNumber"), new onViewAttachedToWindowlambda0(AutofillType.PhoneNumberDevice, "phoneNumberDevice"), new onViewAttachedToWindowlambda0(AutofillType.PhoneCountryCode, "phoneCountryCode"), new onViewAttachedToWindowlambda0(AutofillType.PhoneNumberNational, "phoneNational"), new onViewAttachedToWindowlambda0(AutofillType.Gender, "gender"), new onViewAttachedToWindowlambda0(AutofillType.BirthDateFull, "birthDateFull"), new onViewAttachedToWindowlambda0(AutofillType.BirthDateDay, "birthDateDay"), new onViewAttachedToWindowlambda0(AutofillType.BirthDateMonth, "birthDateMonth"), new onViewAttachedToWindowlambda0(AutofillType.BirthDateYear, "birthDateYear"), new onViewAttachedToWindowlambda0(AutofillType.SmsOtpCode, "smsOTPCode"));

    private static /* synthetic */ void getAndroidAutofillTypes$annotations() {
    }

    public static /* synthetic */ void getAndroidType$annotations(AutofillType autofillType) {
    }

    public static final String getAndroidType(AutofillType autofillType) {
        String str = androidAutofillTypes.get(autofillType);
        if (str != null) {
            return str;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unsupported autofill type");
        return null;
    }
}
