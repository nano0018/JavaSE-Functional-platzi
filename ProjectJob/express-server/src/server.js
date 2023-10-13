import express from 'express';
import { config } from './config/config.js';
import { positions } from './service/jobs.service.js';

const app = express();
app.use(express.json());

app.get('/api', (req, res) => {
    res.json({
        test: 'ok',
    });
});

app.get ('/api/jobs/positions', async (req, res) => {
    try {
        const data = await positions;
        res.json(data);
    } catch (e) {
        console.error(e)
        res.status(500).json({
            msg: e
        })
    }
});

app.listen(config.api.port, () => {
    console.log(`Server running on port ${config.api.port}`);
});

