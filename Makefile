.PHONY: setup run-dist

setup:
	cd app && chmod +x gradlew && ./gradlew clean install

run-dist:
	cd app && ./gradlew run