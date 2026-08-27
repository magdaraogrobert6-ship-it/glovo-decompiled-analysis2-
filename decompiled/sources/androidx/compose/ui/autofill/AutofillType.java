package androidx.compose.ui.autofill;

import coil3.util.UtilsKt;
import o.onItemDismisslambda0;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public enum AutofillType {
    EmailAddress,
    Username,
    Password,
    NewUsername,
    NewPassword,
    PostalAddress,
    PostalCode,
    CreditCardNumber,
    CreditCardSecurityCode,
    CreditCardExpirationDate,
    CreditCardExpirationMonth,
    CreditCardExpirationYear,
    CreditCardExpirationDay,
    AddressCountry,
    AddressRegion,
    AddressLocality,
    AddressStreet,
    AddressAuxiliaryDetails,
    PostalCodeExtended,
    PersonFullName,
    PersonFirstName,
    PersonLastName,
    PersonMiddleName,
    PersonMiddleInitial,
    PersonNamePrefix,
    PersonNameSuffix,
    PhoneNumber,
    PhoneNumberDevice,
    PhoneCountryCode,
    PhoneNumberNational,
    Gender,
    BirthDateFull,
    BirthDateDay,
    BirthDateMonth,
    BirthDateYear,
    SmsOtpCode;

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }
}
