// import fs from "fs/promises";
// export const jobs = JSON.parse(await fs.readFile("./src/data/data.json"));

import { faker } from "@faker-js/faker";

export const createRandomJobPost = () => {
	return {
        id: faker.string.uuid(),
        created_at: faker.date.past(),
        company: faker.company.name(),
        company_url: faker.internet.url(),
        company_logo: faker.image.avatar(),
        location: faker.location.city(),
        title: faker.person.jobTitle(),
        url: faker.internet.url(),
		description: faker.lorem.paragraph(),
	};
};

export const positions = faker.helpers.multiple(createRandomJobPost, {
    count: 30,
});