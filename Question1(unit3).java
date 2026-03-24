class UsernameValidator:
    def __init__(self, username):
        self.username = username

    def clean_username(self):
        cleaned = self.username.strip()
        cleaned = cleaned.lower()
        return cleaned

    def display_username(self):
        cleaned_username = self.clean_username()
        print("Cleaned Username:", cleaned_username)


user_input = input("Enter your username: ")
validator = UsernameValidator(user_input)
validator.display_username()
