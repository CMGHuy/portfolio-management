package cmgh.portfolio_management.definitions;

public enum LanguageCode {
    en,
    vi;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
